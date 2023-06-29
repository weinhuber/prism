package grpc.server;

import com.google.protobuf.ByteString;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import grpc.server.services.PrismGrpc;
import grpc.server.services.PrismProtoServiceGrpc;
import grpc.server.services.FileStore;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

// implementation of all prism services
class PrismServerService extends PrismProtoServiceGrpc.PrismProtoServiceImplBase {

    private final FileStore fileStore = new FileStore("tmp/");
    private static final Logger logger = Logger.getLogger(PrismServer.class.getName());

    @Override
    public void modelCheck(PrismGrpc.ModelCheckRequest request, StreamObserver<PrismGrpc.ModelCheckResponse> responseObserver) {
        logger.info("Received modelCheck request");
        logger.info("Received property file name: " + request.getPropertiesFileName() + " at index " + request.getPropertyIndex());

        // TODO: Call prism to model check


        // build response
        PrismGrpc.ModelCheckResponse response = PrismGrpc.ModelCheckResponse.newBuilder()
                .setResult(0.16666650772094727)
                .build();
        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("modelCheck request completed with response: " + response.getResult());

    }

    @Override
    public void parsePropertiesFile(PrismGrpc.ParsePropertiesFileRequest request, StreamObserver<PrismGrpc.ParsePropertiesFileResponse> responseObserver) {
        logger.info("Received parsePropertiesFile request");
        logger.info("Received file: " + request.getPropertiesFileName());
        // TODO: Call prism to parse properties file

        // build response
        PrismGrpc.ParsePropertiesFileResponse response = PrismGrpc.ParsePropertiesFileResponse.newBuilder()
                .setStatus("Success")
                .addAllProperties(Arrays.asList("P=? [ F s=7&d=6 ]", "P=? [ F s=7&d=x ]", "R=? [ F s=7 ]"))
                .build();
        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("parsePropertiesFile request completed with response: " + response.getStatus());

    }

    @Override
    public void parseAndLoadModel(PrismGrpc.ParseAndLoadModelRequest request, StreamObserver<PrismGrpc.ParseAndLoadModelReply> responseObserver) {
        logger.info("Received parseModelFile request");
        logger.info("Received file: " + request.getModelFileName());
        // TODO: parse model file
        /*
        // Parse and load a PRISM model from a file
        ModulesFile modulesFile = prism.parseModelFile(new File("examples/dice.pm"));
        prism.loadPRISMModel(modulesFile);
         */
        // build response
        PrismGrpc.ParseAndLoadModelReply response = PrismGrpc.ParseAndLoadModelReply.newBuilder()
                .setResult("Success")
                .build();
        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("parseModelFile request completed with response: " + response.getResult());
    }

    @Override
    public void initialise(PrismGrpc.InitialiseRequest request, StreamObserver<PrismGrpc.InitialiseResponse> responseObserver) {
        logger.info("Received initialise request");

        // TODO: initialise prism
        /*
        // Create a log for PRISM output (hidden or stdout)
        PrismLog mainLog = new PrismDevNullLog();
        //PrismLog mainLog = new PrismFileLog("stdout");

        // Initialise PRISM engine
        Prism prism = new Prism(mainLog);
        prism.initialise();
        */
        // TODO: Create lookup table with UID and corresponding ModulesFiles and PropertiesFiles

        // build response
        PrismGrpc.InitialiseResponse response = PrismGrpc.InitialiseResponse.newBuilder()
                .setResult("Success")
                .build();

        // send response
        responseObserver.onNext(response);


        // complete call
        responseObserver.onCompleted();
        logger.info("Initialise request completed with response: " + response.getResult());
    }

    // uploadFile is a service that allows the client to upload a file to the prism server
    @Override
    public StreamObserver<PrismGrpc.UploadRequest> uploadFile(StreamObserver<PrismGrpc.UploadReply> responseObserver) {
        ByteArrayOutputStream fileData = new ByteArrayOutputStream();
        logger.info("Received upload file request");
        return new StreamObserver<PrismGrpc.UploadRequest>() {

            @Override
            public void onNext(PrismGrpc.UploadRequest request) {


                ByteString chunkData = request.getChunkData();
                logger.info("Received chunk: " + chunkData.size());

                try {
                    chunkData.writeTo(fileData);
                } catch (IOException e) {
                    responseObserver.onError(
                            Status.INTERNAL
                                    .withDescription("Error writing chunk to file: " + e.getMessage())
                                    .asRuntimeException());
                }
            }

            @Override
            public void onError(Throwable throwable) {
                logger.warning(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                logger.info("File upload completed");
                String fileName = "";
                try {
                    fileName = fileStore.saveFile("test.txt", fileData);
                } catch (IOException e) {
                    logger.warning("cannot save file: " + e.getMessage());
                    responseObserver.onError(
                            Status.INTERNAL
                                    .withDescription("cannot save file: " + e.getMessage())
                                    .asRuntimeException());
                }
                PrismGrpc.UploadReply reply = PrismGrpc.UploadReply.newBuilder().setFilename(fileName).build();
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            }
        };
    }

}