package com.Art.filemanagementservices;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputFileManager {
    public static void readDataFromATextFile (File file){
        try {
            System.out.println(Files.readString(Path.of(file.getPath())));
        } catch (IOException exceptionObject) {
            System.out.println("Found an Exception - Read Data from Text File" + exceptionObject.getMessage());
        }
    }
    public static void readDataFromATextFileUsingFileReader (File file){
        try {
            FileReader fileReader = new FileReader(file);
            int charIntValuel = 0;

            while ((charIntValuel = fileReader.read()) != -1) {
                System.out.print ((char) charIntValuel); //(char) - принудительно заставляет напечатать букву, а не юникод
            }
        } catch (IOException exceptionObject) {
            System.out.println("Found an Exception in - File Reader" + exceptionObject.getMessage());
        }
    }
    public static void readDataFromTextFileUssingBufferedReader (File inputFile) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found" + e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                }
            }
        }
    }