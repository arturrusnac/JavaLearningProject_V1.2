package com.Art.operationsandcyclingfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber;
        String dayName = "Duminica";
        System.out.println(dayName.toUpperCase() );

        switch (dayName) {
            case "Luni":
                dayNumber = 1;
                break;
            case "Marti":
                dayNumber = 2;
                break;
            case "Miercuri":
                dayNumber = 3;
                break;
            case "Joi":
                dayNumber = 4;
                break;
            case "Vineri":
                dayNumber = 5;
                break;
            case "Simbata":
                dayNumber = 6;
                break;
            case "Duminica":
                dayNumber = 7;
                break;
            default:
                dayNumber = 0;
            System.out.println("ati introdus o zi care nu e definita:  ");


        }
        System.out.println("Numarul zilei: " + dayName + " este " + dayNumber);
    }
}
