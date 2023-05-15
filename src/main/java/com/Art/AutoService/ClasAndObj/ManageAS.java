package com.Art.AutoService.ClasAndObj;

public class ManageAS {
    public static void main(String[] args) {

        Garage CarMax = new Garage("kaiser street - 12");
        System.out.println("CarMax - Garage:   " + CarMax.address);
        CarMax.carCapacity = 10;
        CarMax.compDiag = true;
        CarMax.numBox = "54";
        CarMax.Scheduler = "09.00 - 17.00";

        System.out.println("CarMax - proprieties:" +
                " CarCapacity: " + CarMax.carCapacity +
                ",  NumarBox: " + CarMax.numBox +
                ",  WorkTime: " + CarMax.Scheduler +
                ",  Computer Diagnostics: " + CarMax.compDiag);

        Garage copArt = new Garage("Keonigseg street - 7");
        System.out.println("CopArt - Garage:   " + copArt.address);
        copArt.carCapacity = 7;
        copArt.compDiag = true;
        copArt.numBox = "10";
        copArt.Scheduler = "10.00 - 18.00";

        System.out.println("CopArt - proprieties:" +
                " CarCapacity: " + copArt.carCapacity +
                ",  NumarBox: "  + copArt.numBox +
                ",  WorkTime: "  + copArt.Scheduler +
                ",  Computer Diagnostics: "  + copArt.compDiag);


        Garage Car64 = new Garage (7);
        Car64.address = "Burebista 45";
        System.out.println("Car64 - Garage:   " + Car64.address);

        Car64.compDiag = true;
        Car64.numBox = "5";
        Car64.Scheduler = "08.00 - 17.00";
        System.out.println("Car64 - proprieties:" +
                " CarCapacity: " + Car64.carCapacity +
                ",  NumarBox: " + Car64.numBox +
                ",  WorkTime: " + Car64.Scheduler +
                ",  Computer Diagnostics: " + Car64.compDiag);

// Constructor - Car details in service

        Car owner = new Car("KIA", "Sportage", 2019, "Benzin" );
        owner.carPrice = 25700;
        owner.km = 35055;
        owner.gearType = "Automatic";

        System.out.println("Car 1: Brand - " + owner.brand +
                        " Model: " + owner.model +
                        ",  Prod.Year: " + owner.productionYear +
                        ",  FuelType: " + owner.fuelType +
                        ",  CarPrice: " + owner.carPrice +
                        ",  KM: " + owner.km +
                        ",  GearType: " + owner.gearType);


// Constructor - Aditional/Special tools in service

        Tools elevatorTool = new Tools(1007299000);
        elevatorTool.isElevator = true;
        elevatorTool.isUsed = true;
        elevatorTool.needElectricity = true;

        System.out.println("Elevator prop: >>>  " +
                          " SerialNumber: " + elevatorTool.serialNr +
                          ",  Elevator: " + elevatorTool.isElevator +
                          ",  Electric Capacity: " + elevatorTool.needElectricity +
                          ",  Used: " + elevatorTool.isUsed);

// Constructor - Worker name, Status, job title.

        Workers wDesc = new Workers();
        wDesc.name = "Michael Shumacher";
        wDesc.age = 40;
        wDesc.isExperienced = true;
        wDesc.sexType = "M";
        wDesc.specialization = "Electric Auto";
        System.out.println("Auto Service - Worker:");
        System.out.println("WorkerDesc: >>> " +
                           " Name: " + wDesc.name +
                           ",  Age: " + wDesc.age +
                           ",  Expririence: " + wDesc.isExperienced +
                           ",  Sex: " + wDesc.sexType +
                           ",  Speciality: " + wDesc.specialization );

    }
}
