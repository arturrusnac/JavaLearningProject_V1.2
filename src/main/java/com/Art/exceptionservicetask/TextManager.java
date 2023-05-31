package com.Art.exceptionservicetask;

public class TextManager {
    public static  int getTheTextLenghtWithTryCatchFinally(String inputString) {
        return inputString.length();
    }
    public static  int getTheTextLenght(String inputString) {
        try {
            return inputString.length();

        } catch (NullPointerException capturedExceptionInTryBlock) {
            System.out.println("An exception has been captured with the following mess: " + capturedExceptionInTryBlock.getMessage());
        return 0;

        } finally {
            System.out.println("this block is executed no matter what");
        }
    }
    public static  int getTheTextLenghtIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("input string is a null value, be careful !!! ");
return 0;

        } else {
            return inputString.length();
        }
    }
}
