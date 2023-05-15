package com.Art.AutoService.ClasAndObj;

public class Car {
// Declaram parametrii

    int km;
    String gearType;
    String brand;
    String model;
    int productionYear;
    double carPrice;
    String fuelType;

// Initializam constructorul

Car (String brand, String model, int productionYear, String fuelType) {
    this.brand = brand;
    this.model = model;
    this.productionYear = productionYear;
    this.fuelType = fuelType;
    System.out.println("Car Options: ");

}

    Car (String brand, String model) {
    this.brand = brand;
    this.model = model;
        System.out.println("Car Brand: ");

    }
}
