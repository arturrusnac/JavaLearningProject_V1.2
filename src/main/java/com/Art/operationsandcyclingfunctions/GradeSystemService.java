package com.Art.operationsandcyclingfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 76;
        if (testResult >= 90) {
            System.out.println("Calificativul - A");
        } else if (testResult >= 80) {
            System.out.println("Calificativul - B");
        } else if (testResult >= 70) {
            System.out.println("Calificativul - C");
        } else if (testResult >= 60) {
            System.out.println("Calificativul - D");
        } else if (testResult >= 50) {
            System.out.println("Calificativul - F");
        }
     else {
            System.out.println("Acest Calificativ, nu este definit");

        }
    }
}
