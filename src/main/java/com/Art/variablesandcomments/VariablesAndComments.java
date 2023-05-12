package com.Art.variablesandcomments;

public class VariablesAndComments {

    public static void main(String[] args) {
        // Declare the primitive data type variables
        boolean falseBoleanVariable;
        boolean trueBooleanVariable;
        char firstCharFromAscii;
        char lastCharFromAscii;
        byte lowerLimitOfByteDataType;
        byte upperLimitOfByteDataType;
        short lowerLimitOfShortDataType;
        short upperLimitOfShortDataType;
        int lowerLimitOfIntDataType;
        int upperLimitOfIntDataType;
        long lowerLimitOfLongDataType;
        long upperLimitOfLongDataType;
        float lowerLimitOfFloatDataType;
        float upperLimitOfFloatDataType;
        double lowerLimitOfDoubleDataType;
        double upperLimitOfDoubleDataType;

        // Initialization of the Above Variables

        falseBoleanVariable = false;
        trueBooleanVariable = true;
        firstCharFromAscii = 'a';
        lastCharFromAscii = 'Z';
        lowerLimitOfByteDataType = -128;
        upperLimitOfByteDataType = 127;
        lowerLimitOfShortDataType = -32768;
        upperLimitOfShortDataType = 32767;
        lowerLimitOfIntDataType = -2147483648;
        upperLimitOfIntDataType = 2147483647;
        lowerLimitOfLongDataType = -9223372036854775808L;
        upperLimitOfLongDataType = 9223372036854775807L;
        lowerLimitOfFloatDataType = -3.4E+38f;
        upperLimitOfFloatDataType = 3.4E+38f;
        lowerLimitOfDoubleDataType = -1.7E+308d;
        upperLimitOfDoubleDataType = 1.7E+308d;

        //print all data to screen

        System.out.println(falseBoleanVariable);
        System.out.println(trueBooleanVariable);
        System.out.println(firstCharFromAscii + "A");
        System.out.println(lastCharFromAscii + "z");
        System.out.println(lowerLimitOfByteDataType - 1);
        System.out.println(upperLimitOfByteDataType + 1);
        System.out.println(lowerLimitOfShortDataType - 1);
        System.out.println(upperLimitOfShortDataType + 1);
        System.out.println(lowerLimitOfIntDataType - 1);
        System.out.println(upperLimitOfIntDataType + 1);
        System.out.println(lowerLimitOfLongDataType - 1);
        System.out.println(upperLimitOfLongDataType + 1);
        System.out.println(lowerLimitOfFloatDataType - 1);
        System.out.println(upperLimitOfFloatDataType + 1);
        System.out.println(lowerLimitOfDoubleDataType - 1);
        System.out.println(upperLimitOfDoubleDataType + 1);
    }
}
