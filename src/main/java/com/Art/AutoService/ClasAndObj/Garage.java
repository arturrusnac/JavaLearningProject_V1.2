package com.Art.AutoService.ClasAndObj;

import java.util.Date;

public class Garage {
    String address;
    Boolean compDiag;
    int carCapacity;
    String numBox;
    String Scheduler;


    Garage(String autoServiceAdress){
        this.address = autoServiceAdress;
        // System.out.println("A fost creat un garaj");
    }
    Garage(int carCapacity){
        this.carCapacity = carCapacity;
    }

}
