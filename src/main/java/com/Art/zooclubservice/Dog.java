package com.Art.zooclubservice;

public class Dog extends Animal implements AnimalInterface {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + getName() + " say: Woff... Woff...!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "  eating meat  ");
    }
}