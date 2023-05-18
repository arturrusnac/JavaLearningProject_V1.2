package com.Art.accesmodifiers.peopleevidence;

public class Person {
    // * Public dates *
    public String name;
    public String gender;
    public  String address;
    public boolean isMarried;

    // * Private dates *
    private int BirthDay;
    private String IDNP;

    // * Protected dates *
    protected int phoneNr;
    String education;
    String nationality;
    String email;

    // 1 function
    public Person (String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.BirthDay = age;
        System.out.println("Person with 3 parameters was created: ");
    }
    // 2 function
    public Person(String name, int phoneNr, String education, String IDNP){
        this.name = name;
        this.phoneNr = phoneNr;
        this.education = education;
        this.IDNP = IDNP;
        System.out.println("Person with 4 parameters was created: ");
    }

}