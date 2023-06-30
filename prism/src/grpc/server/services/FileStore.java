package grpc.server.services;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class FileStore {
    private final String fileFolder;

    public FileStore(String fileFolder) {
        this.fileFolder = fileFolder;
    }

    public String saveFile(String fileName, ByteArrayOutputStream fileData) throws IOException {
        // cutting away path if present
        String pureFileName = fileName.substring(fileName.lastIndexOf("/") + 1);

        String filePath = fileFolder + pureFileName;
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        fileData.writeTo(fileOutputStream);
        fileOutputStream.close();

        System.out.println("STORED: " + filePath);
        return filePath;
    }

}
