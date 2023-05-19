package com.Art.operationsandcyclingfunctions;

public class AsignedOperationsExample {
    public static void main(String[] args) {
        int a = 25;
        int b = 40;

        //atribuire simpla
        int result = a;
        System.out.println("atribuire simpa: " + result);

        //atribuire cu adunare
        result += b;
        System.out.println("atr. cu adunare:  " + result);

        //atribuire cu scadere
        result -= b;
        System.out.println("atr. cu scadere:  " + result);

        //atribuire cu inmultire
        result *= b;
        System.out.println("atr. cu inmultire:  " + result);

        //atribuire cu impartire
        result /= b;
        System.out.println("atr. cu impartire:  " + result);

        //atribuire cu rest.impart.
        result += b;
        System.out.println("atr. cu rest.impart:  " + result);
    }
}
