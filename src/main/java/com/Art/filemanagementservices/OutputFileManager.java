package com.Art.filemanagementservices;

import java.io.*;

public class OutputFileManager {
    public static void writeDataIntoFile (File file, String content) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
        } catch (IOException e) {
            System.out.println("Found Exception - File Writer: " + e.getMessage());
        } finally {
          if (fileWriter != null){
              try {
                  fileWriter.close();
              } catch (IOException e) {
                e.printStackTrace();
              }
          }
        }

    }
    public static void writeDataIntoFileWhithBufferedWrite (File file, String content){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter (new FileWriter(file));
            bufferedWriter.write(content);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
