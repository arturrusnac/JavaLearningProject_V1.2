package com.Art.operationsandcyclingfunctions;

public class ComparitionOperationsExamples {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;

        // egal cu:
        boolean isEqual = a == b;
        System.out.println("Egal cu:  " + isEqual);

        // Diferit de
        boolean isNotEqual = a != b;
        System.out.println("Diferit de:  " + isNotEqual);

        //Mai mare de cit
        boolean isGreatThan = a > b;
        System.out.println("Mai mare de cit:  " + isGreatThan);

        //Mai mic de cit
        boolean isSmallThan = a < b;
        System.out.println("Mai mic de cit:  " + isSmallThan);

        //Mai mare sau egal
        boolean isGreatEqual = a >= b;
        System.out.println("Mai mare sau egal de cit:  " + isGreatEqual);

        //Mai mic sau egal de cit
        boolean isSmallEqual = a <= b;
        System.out.println("Mai mic sau egal de cit:  " + isSmallEqual);
    }
}
