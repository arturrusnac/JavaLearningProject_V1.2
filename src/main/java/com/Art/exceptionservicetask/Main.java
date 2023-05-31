package com.Art.exceptionservicetask;

import java.io.IOException;

public class Main {
         public static void main(String[] args) throws IOException {
//         int result = ArithmeticOperationService.divideIntWithExceptionHandling(10, 7);
//        System.out.println(result);
//        System.out.println("the program is runnig till the end");
//
//        String stringValue = "Jony";
//        String stringValue2 = null;
//
//        System.out.println(TextManager.getTheTextLenghtWithTryCatchFinally (stringValue2));
//        System.out.println(TextManager.getTheTextLenght (stringValue));
//        System.out.println(TextManager.getTheTextLenghtIfElse (stringValue2));

        String filePath = " src/main/java/com/Art/exceptionservicetask/test.txt ";
        try {
            ReadDataManager.readDataFromFileWhitoutTryCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("This file does not exist. The execution of the programme is not intrerupted !!!");

        } finally {
            System.out.println("this blockis always executed");
        }
        System.out.println("Program is Running");
        ReadDataManager.readDataFromFileWithTryCatch(filePath);

    }
}
