package com.Art.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        System.out.println();
        Animal dog = new Dog("Tuzic");
        Dog secDog = new Dog("Belka");
        Cat cat = new Cat("Murzic");
        Cat secCat = new Cat("Kashtan");

        dog.getName();
        dog.eat();
        dog.getName();
        secDog.makeSound() ;
        secDog.getName();
        secDog.eat();
        cat.eat();
        cat.makeSound();
        secCat.eat ();
        secCat.makeSound();
    }
}