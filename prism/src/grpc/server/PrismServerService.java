package grpc.server;

import com.google.protobuf.ByteString;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import grpc.server.services.PrismGrpc;
import grpc.server.services.PrismProtoServiceGrpc;
import grpc.server.services.FileStore;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import grpc.server.services.PrismGrpcLogger;
import parser.ast.ModulesFile;
import prism.*;

// implementation of all prism services
class PrismServerService extends PrismProtoServiceGrpc.PrismProtoServiceImplBase {

    private final FileStore fileStore = new FileStore("src/grpc/server/tmpFileStorage/");
    private final PrismGrpcLogger logger = PrismGrpcLogger.getLogger();

    // dict storing all prism instances
    private Map<String, Object> prismObjectMap = new HashMap<>();

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
        logger.info("Received parseModelFile request for file: " + request.getModelFileName());

        String result = "Error";
        // Parse and load a PRISM model from a file
        try{
            Prism prism = (Prism) prismObjectMap.get("prism");
            ModulesFile modulesFile = prism.parseModelFile(new File("src/grpc/server/tmpFileStorage/" + request.getModelFileName()));
            prism.loadPRISMModel(modulesFile);
            result = "Success";
        } catch (PrismException | IllegalArgumentException | FileNotFoundException e) {
            logger.warning("Error loading prism model: " + e.getMessage());
        }


        // build response
        PrismGrpc.ParseAndLoadModelReply response = PrismGrpc.ParseAndLoadModelReply.newBuilder()
                .setResult(result)
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

        String result = "Error";

        // Get the requested log type from request
        PrismGrpc.PrismLog log = request.getLog();
        PrismLog mainLog;

        try {
            if (log.hasDevNullLog()) {
                mainLog = new PrismDevNullLog();
                logger.info("Successfully initialised prism with log type: " + mainLog.toString());
            } else if (log.hasFileLog()) {
                String outputType = log.getFileLog().getType();
                mainLog = new PrismFileLog(outputType);
                logger.info("Successfully initialised prism with log type: " + mainLog.toString() + " and output type: " + outputType);
            } else {
                throw new IllegalArgumentException("Invalid log type");
            }

            // Initialise PRISM engine
            Prism prism = new Prism(mainLog);
            prism.initialise();
            prismObjectMap.put("prism", prism);
            result = "Success";


        }
        catch (PrismException | IllegalArgumentException e) {
            logger.warning("Error initialising prism: " + e.getMessage());
            result += ": " + e.getMessage();
        }


        // build response
        PrismGrpc.InitialiseResponse response = PrismGrpc.InitialiseResponse.newBuilder()
                .setResult(result)
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
        final String[] fileName = {""};

        logger.info("Received upload file request");
        return new StreamObserver<PrismGrpc.UploadRequest>() {

            @Override
            public void onNext(PrismGrpc.UploadRequest request) {

                if (request.getDataCase() == PrismGrpc.UploadRequest.DataCase.FILENAME) {
                    fileName[0] = request.getFilename();
                    logger.info("Received filename: " + fileName[0]);
                }


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
                // cutting away path if present
                String pureFileName = fileName[0].substring(fileName[0].lastIndexOf("/") + 1);

                try {
                    fileStore.saveFile(pureFileName, fileData);
                } catch (IOException e) {
                    logger.warning("cannot save file: " + e.getMessage());
                    responseObserver.onError(
                            Status.INTERNAL
                                    .withDescription("cannot save file: " + e.getMessage())
                                    .asRuntimeException());
                }
                PrismGrpc.UploadReply reply = PrismGrpc.UploadReply.newBuilder().setFilename(pureFileName).build();
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            }
        };
    }

}
