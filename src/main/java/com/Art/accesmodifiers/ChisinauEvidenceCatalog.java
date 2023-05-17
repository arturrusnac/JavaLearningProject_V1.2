package com.Art.accesmodifiers;

import com.Art.accesmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        Person arturPerson = new Person("Artur Rusnac","M",40);

        arturPerson.isMarried = true;
        if (arturPerson.isMarried)
        {
            System.out.println("Artur Rusnac - este casatorit(a)");
        } else {
            System.out.println("Artur Rusnac - nu este casatorit(a)");
        }

        Person oleseaPerson = new Person("Olesea Rusnac","F",37);
        oleseaPerson.isMarried = true;
        if (oleseaPerson.isMarried){
            System.out.println("Olesea Rusnac - este casatorit(a)");
        } else{
            System.out.println("Olesea Rusnac - nu este casatorit(a)");
        }

        Person tatianaPerson = new Person("Tatiana Albot", "F", 23);

        tatianaPerson.isMarried = false;
        if (tatianaPerson.isMarried){
            System.out.println("Elena este casatorit(a)");
        } else {
            System.out.println("Elena nu este casatorit(a)");
        }

        Person mihaiPerson = new Person("Mihai Prisacaru", 69322272,"Student", "2018450046756");

        mihaiPerson.isMarried = false;
            if (mihaiPerson.isMarried){
            System.out.println("Mihai Prisacaru - este casatorit(a)");
        } else {
            System.out.println("Mihai Prisacaru - nu este casatorit(a)");
        }

            Person anaPerson = new Person("Ana Advahov", 69012123,"University Degree","2018432932410");

        anaPerson.isMarried = true;
            if (anaPerson.isMarried) {
            System.out.println("Ana Advahov - este casatorit(a)");
        } else {
            System.out.println("Ana Advahov - nu este casatorit(a)");
        }

    }

    }

