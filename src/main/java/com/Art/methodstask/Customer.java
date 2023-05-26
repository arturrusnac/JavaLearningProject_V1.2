package com.Art.methodstask;

public class Customer {
    private String name;
    private int age;
    private String email;

    public Customer(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;

    }
public String getName(){
        return name;
}
public int getAge(){
        return this.age;
}
public String getEmail(){
        return this.email;
}
public void setName(String newName){
        this.name=newName;

}

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
