package com.Art.operationsandcyclingfunctions;

public class PrintNumberService {
    public static void main(String[] args) {

        // Cream un ciclu care ne arata toate cifrele in scadere de la 500 pina la 1
        int a = 500;
        int limit = 500;
        while (a > 0) {
            System.out.print(a + ", ");
            a--;
        }
        // Val.lui 'a' cind ese din ciclu = 0

        System.out.println();
        do {
            System.out.print(a + ", ");
            a++;
        } while (a < limit);

        System.out.println();

        for (int i = 1; i <= limit; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + ", ");
            }
            else
                System.out.print("[], ");{
            }
            }
        }
    }


