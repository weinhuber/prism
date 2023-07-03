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
import java.util.*;

import grpc.server.services.PrismGrpcLogger;
import parser.Values;
import parser.ast.ModulesFile;
import parser.ast.PropertiesFile;
import parser.ast.Property;
import prism.*;

// implementation of all prism services
class PrismServerService extends PrismProtoServiceGrpc.PrismProtoServiceImplBase {

    private final FileStore fileStore = new FileStore("src/grpc/server/tmpFileStorage/");
    private final PrismGrpcLogger logger = PrismGrpcLogger.getLogger();

    // dict storing all prism instances
    private Map<String, Object> prismObjectMap = new HashMap<>();


    @Override
    public void initialise(PrismGrpc.InitialiseRequest request, StreamObserver<PrismGrpc.InitialiseResponse> responseObserver) {
        logger.info("Received initialise request");

        // get prism id from request
        String prismId = request.getPrismObjectId();

        String status = "Error";

        // initialise prism
        try {
            Prism prism = new Prism(new PrismDevNullLog());
            prism.initialise();
            prismObjectMap.put(prismId, prism);
            status = "Success";
        } catch (PrismException e) {
            logger.warning("Error initialising prism: " + e.getMessage());
        }

        // build response
        PrismGrpc.InitialiseResponse response = PrismGrpc.InitialiseResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("initialise request completed with status: " + status);
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
            // check if result object already exists
            if(!prismObjectMap.containsKey(resultId)){
                prismObjectMap.put(resultId, new Result());
            }
            // retrieve prism objects
            Prism prism = (Prism) prismObjectMap.get(prismObjectId);
            PropertiesFile propertiesFile = (PropertiesFile) prismObjectMap.get(propertiesFileObjectId);
            Property propertyObject = (Property) prismObjectMap.get(propertyObjectId);
            Result modelCheckResult = (Result) prismObjectMap.get(resultId);

            modelCheckResult = prism.modelCheck(propertiesFile, propertyObject);
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
    public void getPFConstantValues(PrismGrpc.GetPFConstantValuesRequest request, StreamObserver<PrismGrpc.GetPFConstantValuesResponse> responseObserver) {
        logger.info("Received getPFConstantValues request");

        // get undefined constants object id from request
        String undefinedConstantsId = request.getUndefinedConstantsObjectId();

        // get values object id from request
        String valuesObjectId = request.getValuesObjectId();

        String status = "Error";
        String valuesResult = "";

        // get properties constant values
        try {
            // check if values object already exists
            if(!prismObjectMap.containsKey(valuesObjectId)){
                // create new values object
                prismObjectMap.put(valuesObjectId, new Values());
            }

            UndefinedConstants undefinedConstants = (UndefinedConstants) prismObjectMap.get(undefinedConstantsId);
            Values values = (Values) prismObjectMap.get(valuesObjectId);
            values = undefinedConstants.getPFConstantValues();
            valuesResult = values.toString();
            prismObjectMap.put(valuesObjectId, values);
            prismObjectMap.put(undefinedConstantsId, undefinedConstants);
            status = "Success";
        } catch (IllegalArgumentException e) {
            logger.warning("Error getting properties constant values: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.GetPFConstantValuesResponse response = PrismGrpc.GetPFConstantValuesResponse.newBuilder()
                .setStatus(status)
                .setValues(valuesResult)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("getPFConstantValues request completed with status: " + status);
    }

    @Override
    public void iterateProperty(PrismGrpc.IteratePropertyRequest request, StreamObserver<PrismGrpc.IteratePropertyResponse> responseObserver) {
        logger.info("Received iterateProperty request");

        // get undefined constants object id from request
        String undefinedConstantsId = request.getUndefinedConstantsObjectId();

        String status = "Error";

        // iterate property
        try {
            UndefinedConstants undefinedConstants = (UndefinedConstants) prismObjectMap.get(undefinedConstantsId);
            undefinedConstants.iterateProperty();
            status = "Success";
        } catch (IllegalArgumentException e) {
            logger.warning("Error iterating property: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.IteratePropertyResponse response = PrismGrpc.IteratePropertyResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();

        logger.info("iterateProperty request completed with status: " + status);
    }

    @Override
    public void parsePropertiesString(PrismGrpc.ParsePropertiesStringRequest request, StreamObserver<PrismGrpc.ParsePropertiesStringResponse> responseObserver) {
        logger.info("Received parsePropertiesString request");

        // get prism object id from request
        String prismObjectId = request.getPrismObjectId();

        // get module object id from request
        String modulesFileObjectId = request.getModuleObjectId();

        // get properties string from request
        String propertiesString = request.getPropertiesString();

        // get properties object id from request
        String propertiesFileObjectId = request.getPropertiesFileObjectId();

        String status = "Error";

        // parse properties string
        try {
            ModulesFile modulesFile = (ModulesFile) prismObjectMap.get(modulesFileObjectId);
            Prism prism = (Prism) prismObjectMap.get(prismObjectId);
            PropertiesFile propertiesFile = prism.parsePropertiesString(modulesFile, "P=?[F<=5 s=7]");

            prismObjectMap.put(propertiesFileObjectId, propertiesFile);
            status = "Success";
        } catch (PrismLangException| IllegalArgumentException e) {
            logger.warning("Error parsing properties string: " + e.getMessage());
            status += " : " + e.getMessage();
        }

        // build response
        PrismGrpc.ParsePropertiesStringResponse response = PrismGrpc.ParsePropertiesStringResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();

        logger.info("parsePropertiesString request completed with status: " + status);
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


    // Initializers
    // TODO: At later stage, this will be refactored but for now it makes grpc calls easier to debug

    @Override
    public void initPrismLog(PrismGrpc.InitPrismLogRequest request, StreamObserver<PrismGrpc.InitResponse> responseObserver) {
        logger.info("[INIT] - Received initPrismLog request");

        // get object id from request
        String prismLogId = request.getPrismLogObjectId();

        // get type from request
        String type = request.getType();

        String status = "Error";

        // check if mainLog already exists
        if (prismObjectMap.containsKey(prismLogId)) {
            logger.warning("[INIT] - Error initializing prism log: object already exists");
            status += " : object already exists";
        } else {
            // create object
            PrismLog mainLog;

            if (type.equals("hidden")) {
                mainLog = new PrismFileLog("hidden");
            } else if (type.equals("stdout")) {
                mainLog = new PrismFileLog("stdout");
            } else {
                mainLog = new PrismDevNullLog();
            }

            // store prism object in dict for later use
            prismObjectMap.put(prismLogId, mainLog);
            status = "Success";
        }

        // build response
        PrismGrpc.InitResponse response = PrismGrpc.InitResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();

        logger.info("[INIT] - initPrismLog request completed with status: " + status);

    }

    @Override
    public void initPrism(PrismGrpc.InitPrismRequest request, StreamObserver<PrismGrpc.InitResponse> responseObserver) {
        logger.info("[INIT] - Received initPrism request");

        // get object id from request
        String prismId = request.getPrismObjectId();

        // get main log id from request
        String mainLogId = request.getMainLogObjectId();

        String status = "Error";

        // check if prism object already exists
        if (prismObjectMap.containsKey(prismId)) {
            logger.warning("[INIT] - Error initializing prism: object already exists");
            status += " : object already exists";
        } else {
            // get main log object
            PrismLog mainLog = (PrismLog) prismObjectMap.get(mainLogId);

            // create prism object
            Prism prism = new Prism(mainLog);

            // store prism object in dict for later use
            prismObjectMap.put(prismId, prism);
            status = "Success";
        }

        // build response
        PrismGrpc.InitResponse response = PrismGrpc.InitResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();

        logger.info("[INIT] - initPrism request completed with status: " + status);
    }

    @Override
    public void initModulesFile(PrismGrpc.InitModulesFileRequest request, StreamObserver<PrismGrpc.InitResponse> responseObserver) {
        logger.info("[INIT] - Received initModulesFile request");

        // get object id from request
        String modulesFileId = request.getModulesFileObjectId();

        String status = "Error";

        // checking if object already exists
        if (prismObjectMap.containsKey(modulesFileId)) {
            logger.warning("[INIT] - Error initializing modules file: object already exists");
            status += " : object already exists";
        } else {
            // create object
            ModulesFile modulesFile = new ModulesFile();
            String foo = modulesFile.toString();
            prismObjectMap.put(modulesFileId, modulesFile);
            status = "Success";
        }

        // build response
        PrismGrpc.InitResponse response = PrismGrpc.InitResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();
        logger.info("[INIT] -initModulesFile request completed with status: " + status);
    }


    @Override
    public void initPropertiesFile(PrismGrpc.InitPropertiesFileRequest request, StreamObserver<PrismGrpc.InitResponse> responseObserver) {
        notStandalone("initPropertiesFile", responseObserver);
    }

    @Override
    public void initPropertyObject(PrismGrpc.InitPropertyObjectRequest request, StreamObserver<PrismGrpc.InitResponse> responseObserver) {
        notStandalone("initPropertyObject", responseObserver);
    }

    @Override
    public void initResult(PrismGrpc.InitResultRequest request, StreamObserver<PrismGrpc.InitResponse> responseObserver) {
        logger.info("[INIT] - Received initResult request");

        // get object id from request
        String resultId = request.getResultObjectId();

        String status = "Error";

        // check if result object already exists
        if (prismObjectMap.containsKey(resultId)) {
            logger.warning("[INIT] - Error initializing result: object already exists");
            status += " : object already exists";
        } else {
            // create result object
            Result result = new Result();

            // store result object in dict for later use
            prismObjectMap.put(resultId, result);
            status = "Success";
        }

        // build response
        PrismGrpc.InitResponse response = PrismGrpc.InitResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();

        logger.info("[INIT] - initResult request completed with status: " + status);
    }

    @Override
    public void initUndefinedConstants(PrismGrpc.InitUndefinedConstantsRequest request, StreamObserver<PrismGrpc.InitResponse> responseObserver) {
        logger.info("[INIT] - Received initUndefinedConstants request");

        // get object id from request
        String undefinedConstantsId = request.getUndefinedConstantsObjectId();

        // get modules object id from request
        String moduleObjectId = request.getModuleObjectId();

        // get properties file object id from request
        String propertiesFileObjectId = request.getPropertiesFileObjectId();

        // get property object id from request
        String propertyObjectId = request.getPropertyObjectId();

        String status = "Error";

        // check if undefined constants object already exists
        if (prismObjectMap.containsKey(undefinedConstantsId)) {
            logger.warning("[INIT] - Error initializing undefined constants: object already exists");
            status += " : object already exists";
        } else {
            // get modules object
            ModulesFile modules = (ModulesFile) prismObjectMap.get(moduleObjectId);

            // get properties file object
            PropertiesFile propertiesFile = (PropertiesFile) prismObjectMap.get(propertiesFileObjectId);

            // get property object
            Property property = (Property) prismObjectMap.get(propertyObjectId);

            // create undefined constants object
            UndefinedConstants undefinedConstants = new UndefinedConstants(modules, propertiesFile, property);

            // store undefined constants object in dict for later use
            prismObjectMap.put(undefinedConstantsId, undefinedConstants);
            status = "Success";
        }

        // build response
        PrismGrpc.InitResponse response = PrismGrpc.InitResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();

        logger.info("[INIT] - initUndefinedConstants request completed with status: " + status);
    }

    @Override
    public void initValues(PrismGrpc.InitValuesRequest request, StreamObserver<PrismGrpc.InitResponse> responseObserver) {
        logger.info("[INIT] - Received initValues request");

        // get object id from request
        String valuesId = request.getValuesObjectId();

        String status = "Error";

        // check if values object already exists
        if (prismObjectMap.containsKey(valuesId)) {
            logger.warning("[INIT] - Error initializing values: object already exists");
            status += " : object already exists";
        } else {
            // create values object
            Values values = new Values();

            // store values object in dict for later use
            prismObjectMap.put(valuesId, values);
            status = "Success";
        }

        // build response
        PrismGrpc.InitResponse response = PrismGrpc.InitResponse.newBuilder()
                .setStatus(status)
                .build();

        // send response
        responseObserver.onNext(response);

        // complete call
        responseObserver.onCompleted();

        logger.info("[INIT] - initValues request completed with status: " + status);
    }


    // helper logging function for not implemented requests
    private void notStandalone(String serviceName, StreamObserver<PrismGrpc.InitResponse> responseObserver) {
        logger.info("[INIT] - Received " + serviceName + " request");
        logger.info("[INIT] - Currently not implemented");
        responseObserver.onNext(PrismGrpc.InitResponse.newBuilder().setStatus("Not implemented").build());
        responseObserver.onCompleted();
    }
}
