package com.Art.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
    private static Random random = new Random();
    // cream o variabila int - random
    public static int getRandomInt (int min, int max){  // min = 1, max = 150;
        if (min >= max) {
            System.out.println("valoarea minima trebuie sa fie ca cea maxima");
            return 0;

        }
        int delta = max - min;  // delta == 50;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = random.nextInt(delta) + min;  // random de la 0 pina la delta, adica - 50;
        return randomNumber;

    }
    // Metoda Overloaded - Este aceasi metoda ca mai sus, doar ca cu parametri diferiti.
    // In loc de min, max... am folosit limit
    public static int getRandomInt (int limit) {
        return random.nextInt(limit);
    }
    // Variabila double - randome
    // Mesaj daca limita variabilei double este Negativa
    public static double getRandomDouble (double limit) {
        if (limit <=0) {
            System.out.println("limita trebuie sa fie pozitiva");
            return 0;
        }
        return random.nextDouble() * limit;
    }
    // Creeam o variabila boolean - Random
    public static boolean getRandomBoolean (){
        return random.nextBoolean();
    }
    // crearea Email-urilor - Random
    public static String getRandomEmail (){
        String uuid = UUID.randomUUID().toString();
        String domain = "@mailinator.com";

        return uuid + domain;
    }
    public static String generateValidRandomString(int lenght){
        String acceptedChars = "ABCDEFGHIJKLMNOPRSTUQVWXYZabcdefghjklmnoprstuqvwxyz0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i < lenght; i++){
            int randomIndex = getRandomInt(0, acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex) );
            System.out.println("In iteratia: i = " +i + "car. alipit e:  " + acceptedChars.charAt(randomIndex));


        }

        return stringBuilder.toString();
    }
}
