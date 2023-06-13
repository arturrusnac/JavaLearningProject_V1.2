package com.Art.filemanagementservices;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static void createTheFileIfIsDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("File exist");
        } else {
            System.out.println("File Created");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception:   " + e.getMessage());

            }

        }
    }


    public static void informIfTheFileExist(File file) {
        if (file.exists()) {
            System.out.println("File is prezent");
        } else {
            System.out.println("File is not prezent");

        }
    }

    public static void printFileName(File file) {
        System.out.println("File name is:  " + file.getName());
    }

    public static void printFileAbsolutePath(File file) {
        System.out.println("File's absolute path:  " + file.getAbsolutePath());
    }

    public static void printIfTheFileIsDirectory(File inputFile) {
        System.out.println("File is a directory  :" + inputFile.isDirectory());
    }

    public static void deleteTheFileIfExist(File inputFile) {
        if (inputFile.exists()) {
            if (inputFile.delete()) {
                System.out.println("File was deleted");
            } else {
                System.out.println("File exist, but not was deleted");
            }
        } else {
            System.out.println("File not exist");
        }
    }
}