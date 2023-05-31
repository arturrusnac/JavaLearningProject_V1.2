package com.Art.zooclubservice;

public class Cat extends Animal implements AnimalInterface {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + getName() + " say: Meow.. Meow !");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eat the fish ");
    }
}