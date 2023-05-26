package com.Art.methodstask;

public class ExecutionService {
    public static void main(String[] args) {

        int randomInt = DataGeneratorUtil.getRandomInt(150, 350);
        System.out.println("Variabila Random:  " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila Random:  " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble (1000.0 );
        System.out.println("Variabila RandomDouble:  " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble (-1000.0 );
        System.out.println("Variabila RandomDouble:  " + randomDouble1);

        System.out.println("random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random Email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random String de X chars: " + DataGeneratorUtil.generateValidRandomString(5) );

        Customer ionCustomer = new Customer("ion", 26, "ion.boss@gmail.com");
        System.out.println("nume pers. Ion: " + ionCustomer.getName());
        System.out.println("Age pers. Ion: " + ionCustomer.getAge());
        System.out.println("Email pers. Ion: " + ionCustomer.getEmail());

        ionCustomer.setName("Ion Karefur");
        System.out.println("nume pers. Ion: " + ionCustomer.getName());
        System.out.println("Age pers. Ion: " + ionCustomer.getAge());
        System.out.println("Email pers. Ion: " + ionCustomer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12),
                DataGeneratorUtil.getRandomInt(15), DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());
    }
}
