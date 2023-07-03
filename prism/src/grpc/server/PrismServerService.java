package grpc.server;

import com.google.protobuf.ByteString;
import com.google.protobuf.Int32Value;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import grpc.server.services.PrismGrpc;
import grpc.server.services.PrismProtoServiceGrpc;
import grpc.server.services.FileStore;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import grpc.server.services.PrismGrpcLogger;
import parser.Values;
import parser.ast.ModulesFile;
import parser.ast.PropertiesFile;
import parser.ast.Property;
import prism.*;

import javax.swing.*;

// implementation of all prism services
class PrismServerService extends PrismProtoServiceGrpc.PrismProtoServiceImplBase {

    private final FileStore fileStore = new FileStore("src/grpc/server/tmpFileStorage/");
    private final PrismGrpcLogger logger = PrismGrpcLogger.getLogger();

    // dict storing all prism instances
    private Map<String, Object> prismObjectMap = new HashMap<>();


    @Override
    public void initialise(PrismGrpc.InitialiseRequest request, StreamObserver<PrismGrpc.InitialiseResponse> responseObserver) {
        logger.info("Received initialise request");

        String status = "Error";

        // get id from request
        String id = request.getPrismObjectId();

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

            // store prism object in dict for later use
            prismObjectMap.put(id, prism);
            status = "Success";

        }
        catch (PrismException | IllegalArgumentException e) {
            logger.warning("Error initialising prism: " + e.getMessage());
            status += " : " + e.getMessage();
        }


        // build response
        PrismGrpc.InitialiseResponse response = PrismGrpc.InitialiseResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);


        // complete call
        responseObserver.onCompleted();
        logger.info("Initialise request completed with response: " + status);
    }

    @Override
    public void parseModelFile(PrismGrpc.ParseModelFileRequest request, StreamObserver<PrismGrpc.ParseModelFileResponse> responseObserver) {
        logger.info("Received parseModelFile request for file: " + request.getModelFileName());

        // get prism id from request
        String prismId = request.getPrismObjectId();

        // get module id from request
        String moduleId = request.getModuleObjectId();


        String status = "Error";
        // Parse and load a PRISM model from a file

        try{
            Prism prism = (Prism) prismObjectMap.get(prismId);
            ModulesFile modulesFile = prism.parseModelFile(new File("src/grpc/server/tmpFileStorage/" + request.getModelFileName()));
            prismObjectMap.put(moduleId, modulesFile);
            status = "Success";
        } catch (PrismException | IllegalArgumentException | FileNotFoundException e) {
            logger.warning("Error loading prism model: " + e.getMessage());
            status += " : " + e.getMessage();
        }


        // build response
        PrismGrpc.ParseModelFileResponse response = PrismGrpc.ParseModelFileResponse.newBuilder()
                .setStatus(status)
                .build();
        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("parseModelFile request completed with status: " + status);
    }

    @Override
    public void loadPRISMModel(PrismGrpc.LoadPRISMModelRequest request, StreamObserver<PrismGrpc.LoadPRISMModelResponse> responseObserver) {
        logger.info("Received loadPRISMModel request");

        // get prism id from request
        String prismId = request.getPrismObjectId();

        // get module id from request
        String moduleId = request.getModuleObjectId();

        String status = "Error";

        // load prism model
        try{
            Prism prism = (Prism) prismObjectMap.get(prismId);
            ModulesFile modulesFile = (ModulesFile) prismObjectMap.get(moduleId);
            prism.loadPRISMModel(modulesFile);
            status = "Success";
        } catch (PrismException | IllegalArgumentException e) {
            logger.warning("Error loading prism model: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.LoadPRISMModelResponse response = PrismGrpc.LoadPRISMModelResponse.newBuilder()
                .setStatus(status)
                .build();
        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("loadPRISMModel request completed with status: " + status);


    }

    @Override
    public void parsePropertiesFile(PrismGrpc.ParsePropertiesFileRequest request, StreamObserver<PrismGrpc.ParsePropertiesFileResponse> responseObserver) {
        logger.info("Received parsePropertiesFile request for file: " + request.getPropertiesFileName());

        // get prism id from request
        String prismId = request.getPrismObjectId();

        // get module id from request
        String moduleId = request.getModuleObjectId();

        // get property id from request
        String propertyId = request.getPropertiesFileObjectId();

        String status = "Error";

        // Parse and load a PRISM properties file
        try{
            Prism prism = (Prism) prismObjectMap.get(prismId);
            ModulesFile modulesFile = (ModulesFile) prismObjectMap.get(moduleId);
            PropertiesFile propertiesFile = prism.parsePropertiesFile(modulesFile, new File("src/grpc/server/tmpFileStorage/" + request.getPropertiesFileName()));
            prismObjectMap.put(propertyId, propertiesFile);
            status = "Success";
        } catch (PrismException | IllegalArgumentException | FileNotFoundException e) {
            logger.warning("Error loading prism properties: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.ParsePropertiesFileResponse response = PrismGrpc.ParsePropertiesFileResponse.newBuilder()
                .setStatus(status)
                .build();
        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("parsePropertiesFile request completed with status: " + status);
    }


    @Override
    public void getPropertyObject(PrismGrpc.GetPropertyObjectRequest request, StreamObserver<PrismGrpc.GetPropertyObjectResponse> responseObserver) {
        logger.info("Received propertyObject request");

        // get properties file id from request
        String propertiesFileId = request.getPropertiesFileObjectId();

        // get property object id from request
        String propertyObjectId = request.getPropertyObjectId();

        String status = "Error";

        String property = "";

        // load prism properties
        try{
            PropertiesFile propertiesFile = (PropertiesFile) prismObjectMap.get(propertiesFileId);
            Property propertyObject = propertiesFile.getPropertyObject(request.getPropertyIndex());
            prismObjectMap.put(propertyObjectId, propertyObject);
            property = propertyObject.toString();
            status = "Success";
        } catch (IllegalArgumentException e) {
            logger.warning("Error loading prism properties: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.GetPropertyObjectResponse response = PrismGrpc.GetPropertyObjectResponse.newBuilder()
                .setStatus(status)
                .setProperty(property)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("propertyObject request completed with status: " + status);
    }


    @Override
    public void modelCheck(PrismGrpc.ModelCheckRequest request, StreamObserver<PrismGrpc.ModelCheckResponse> responseObserver) {
        logger.info("Received modelCheck request");

        // get prism object id from request
        String prismObjectId = request.getPrismObjectId();

        // get property files object id from request
        String propertiesFileObjectId = request.getPropertiesFileObjectId();

        // get property object id from request
        String propertyObjectId = request.getPropertyObjectId();

        // get result id from request
        String resultId = request.getResultObjectId();

        String status = "Error";

        String result = "";

        // model check
        try{
            Prism prism = (Prism) prismObjectMap.get(prismObjectId);
            PropertiesFile propertiesFile = (PropertiesFile) prismObjectMap.get(propertiesFileObjectId);
            Property propertyObject = (Property) prismObjectMap.get(propertyObjectId);
            Result modelCheckResult = prism.modelCheck(propertiesFile, propertyObject);
            result = modelCheckResult.getResultString();
            prismObjectMap.put(resultId, modelCheckResult);
            status = "Success";
        } catch (PrismException | IllegalArgumentException e) {
            logger.warning("Error loading prism properties: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.ModelCheckResponse response = PrismGrpc.ModelCheckResponse.newBuilder()
                .setStatus(status)
                .setResult(result)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("modelCheck request completed with status: " + status);


    }

    @Override
    public void getUndefinedConstantsUsedInProperty(PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest request, StreamObserver<PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse> responseObserver) {
        logger.info("Received getUndefinedConstantsUsedInProperty request");

        // get properties file id from request
        String propertiesFileId = request.getPropertiesFileObjectId();

        // get property id from request
        String propertyId = request.getPropertyObjectId();

        String status = "Error";

        List<String> constants = null;

        // get undefined constants
        try{
            PropertiesFile propertiesFile = (PropertiesFile) prismObjectMap.get(propertiesFileId);
            Property propertyObject = (Property) prismObjectMap.get(propertyId);
            constants = propertiesFile.getUndefinedConstantsUsedInProperty(propertyObject);
            status = "Success";
            
        } catch (IllegalArgumentException e) {
            logger.warning("Error loading prism properties: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse.Builder responseBuilder = PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse.newBuilder()
                .setStatus(status);

        if(constants != null){
            responseBuilder.addAllConstants(constants);
        }

        PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse response = responseBuilder.build();


        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("getUndefinedConstantsUsedInProperty request completed with status: " + status);
    }


    @Override
    public void addValue(PrismGrpc.AddValueRequest request, StreamObserver<PrismGrpc.AddValueResponse> responseObserver) {
        logger.info("Received addValue request");

        // get values object id
        String valuesObjectId = request.getValuesObjectId();

        String status = "Error";

        String result = "";

        // add value
        try {
            Values values = new Values();

            // check if value object already exists
            if(!prismObjectMap.containsKey(valuesObjectId)){
                // create new values object
                prismObjectMap.put(valuesObjectId, values);
            } else {
                values = (Values) prismObjectMap.get(valuesObjectId);
            }
            values.addValue(request.getConstName(), request.getValue());
            result = values.toString();
            status = "Success";
        } catch (IllegalArgumentException e) {
            logger.warning("Error adding value: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.AddValueResponse response = PrismGrpc.AddValueResponse.newBuilder()
                .setStatus(status)
                .setResult(result)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("addValue request completed with status: " + status);

    }


    @Override
    public void setSomeUndefinedConstants(PrismGrpc.SetSomeUndefinedConstantsRequest request, StreamObserver<PrismGrpc.SetSomeUndefinedConstantsResponse> responseObserver) {
        logger.info("Received setSomeUndefinedConstants request");

        // get properties file id from request
        String propertiesFileId = request.getPropertiesFileObjectId();

        // get values object id from request
        String valuesObjectId = request.getValuesObjectId();

        String status = "Error";

        // set some undefined constants
        try{
            PropertiesFile propertiesFile = (PropertiesFile) prismObjectMap.get(propertiesFileId);
            Values values = (Values) prismObjectMap.get(valuesObjectId);
            propertiesFile.setSomeUndefinedConstants(values);
            status = "Success";

        } catch (IllegalArgumentException e) {
            logger.warning("Error loading prism properties: " + e.getMessage());
            status += " : " + e.getMessage();
        } catch (PrismException e) {
            throw new RuntimeException(e);
        }

        // build response
        PrismGrpc.SetSomeUndefinedConstantsResponse response = PrismGrpc.SetSomeUndefinedConstantsResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("setSomeUndefinedConstants request completed with status: " + status);
    }

    @Override
    public void initUndefinedConstants(PrismGrpc.InitUndefinedConstantsRequest request, StreamObserver<PrismGrpc.InitUndefinedConstantsResponse> responseObserver) {
        logger.info("Received initUndefinedConstants request");

        // get modules file id from request
        String modulesFileId = request.getModuleObjectId();

        // get properties file object id from request
        String propertiesFileId = request.getPropertiesFileObjectId();

        // get property object id from request
        String propertyId = request.getPropertyObjectId();

        // get undefined constants object id from request
        String undefinedConstantsId = request.getUndefinedConstantsObjectId();

        String status = "Error";

        // init undefined constants
        try{
            ModulesFile modulesFile = (ModulesFile) prismObjectMap.get(modulesFileId);
            PropertiesFile propertiesFile = (PropertiesFile) prismObjectMap.get(propertiesFileId);
            Property property = (Property) prismObjectMap.get(propertyId);
            UndefinedConstants undefinedConstants = new UndefinedConstants(modulesFile, propertiesFile, property);
            prismObjectMap.put(undefinedConstantsId, undefinedConstants);
            status = "Success";

        } catch (IllegalArgumentException e) {
            logger.warning("Error loading prism properties: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.InitUndefinedConstantsResponse response = PrismGrpc.InitUndefinedConstantsResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("initUndefinedConstants request completed with status: " + status);
    }

    @Override
    public void defineUsingConstSwitch(PrismGrpc.DefineUsingConstSwitchRequest request, StreamObserver<PrismGrpc.DefineUsingConstSwitchResponse> responseObserver) {
        logger.info("Received defineUsingConstSwitch request");

        // get undefined constants object id from request
        String undefinedConstantsId = request.getUndefinedConstantsObjectId();

        // get constant from request
        String constant = request.getConstant();

        String status = "Error";

        // define using const switch
        try{
            UndefinedConstants undefinedConstants = (UndefinedConstants) prismObjectMap.get(undefinedConstantsId);
            undefinedConstants.defineUsingConstSwitch(constant);
            status = "Success";
        } catch (PrismException | IllegalArgumentException e) {
            logger.warning("Error defining using const switch: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.DefineUsingConstSwitchResponse response = PrismGrpc.DefineUsingConstSwitchResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("defineUsingConstSwitch request completed with status: " + status);

    }


    @Override
    public void getNumberPropertyIterations(PrismGrpc.GetNumberPropertyIterationsRequest request, StreamObserver<PrismGrpc.GetNumberPropertyIterationsResponse> responseObserver) {
        logger.info("Received getNumberPropertyIterations request");

        // get undefined constants object id from request
        String undefinedConstantsId = request.getUndefinedConstantsObjectId();

        String status = "Error";
        int result = -1;

        // get number property iterations
        try {
            UndefinedConstants undefinedConstants = (UndefinedConstants) prismObjectMap.get(undefinedConstantsId);
            result = undefinedConstants.getNumPropertyIterations();
            status = "Success";
        } catch (IllegalArgumentException e) {
            logger.warning("Error getting number property iterations: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.GetNumberPropertyIterationsResponse response = PrismGrpc.GetNumberPropertyIterationsResponse.newBuilder()
                .setStatus(status)
                .setNumberIterations(result)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("getNumberPropertyIterations request completed with status: " + status);
    }

    @Override
    public void deleteObject(PrismGrpc.DeleteObjectRequest request, StreamObserver<PrismGrpc.DeleteObjectResponse> responseObserver) {
        logger.info("[Garbage Collector] - Received deleteObject request");

        // get object id from request
        String objectId = request.getObjectId();

        String status = "Error";

        // delete object
        try{
            Object objectToDelete = prismObjectMap.get(objectId);
            logger.info("[Garbage Collector] - Deleting object: " + objectToDelete.getClass().getSimpleName());
            prismObjectMap.remove(objectId);
            status = "Success";
        } catch (NullPointerException e) {
            logger.warning("[Garbage Collector] - Error deleting object: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.DeleteObjectResponse response = PrismGrpc.DeleteObjectResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("[Garbage Collector] - deleteObject request completed with status: " + status);
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
