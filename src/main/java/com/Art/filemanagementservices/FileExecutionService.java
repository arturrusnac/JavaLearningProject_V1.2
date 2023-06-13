package com.Art.filemanagementservices;

import java.io.File;

public class FileExecutionService {
    public static void main(String[] args) {
        File demoFile = new File("src/main/java/com/Art/filemanagementservices/test.txt");
        FileManager.createTheFileIfIsDoesNotExist(demoFile);
        FileManager.informIfTheFileExist(demoFile);
        FileManager.printIfTheFileIsDirectory(demoFile);
        FileManager.printFileAbsolutePath(demoFile);
        // FileManager.deleteTheFileIfExist(demoFile);
        InputFileManager.readDataFromATextFile(demoFile);
        InputFileManager.readDataFromATextFileUsingFileReader(demoFile);
        InputFileManager.readDataFromTextFileUssingBufferedReader(demoFile);
        OutputFileManager.writeDataIntoFile(demoFile, "Content");
        String contentForTheFile = "New Content for BIG BOSS-es \n another line";
        OutputFileManager.writeDataIntoFileWhithBufferedWrite(demoFile, "New Text");

    }
}
