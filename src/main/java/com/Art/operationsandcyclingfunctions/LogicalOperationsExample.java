package com.Art.operationsandcyclingfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        boolean result = a && b;
        System.out.println("Logic and: " + result);

        // a = true + result false = false
        a = result && b;
        System.out.println("Logic and: " + a);

        result = a || b;
        System.out.println("Logic and: " + result);

        System.out.println("Nagation: " + !result);

    }
}
