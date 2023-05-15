package com.Art.AutoService.ClasAndObj;

public class Tools {

    boolean needElectricity;
    boolean isElevator;
    boolean isUsed;
    long serialNr;

    Tools(){
        System.out.println("Tool: ");
    }
    Tools(long serialNumber){
        serialNr = serialNumber;
        System.out.println("Tool Description: ");

    }
}
