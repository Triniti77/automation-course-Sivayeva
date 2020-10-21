package com.company.homework.hw04;

public class Distance {
    public static void main(String[] args) {

        double meters = 5;
        double mi = 10.0;
        double inches = convertMetersToInches(meters);
        System.out.println(inches);
        meters = convertInchesToMeters(inches);
        System.out.println(meters);
        double km = convertMiToKm(mi);
        System.out.println(km);
        meters = kmToMeters(km );
        System.out.println(meters);

    }
    public static double convertMetersToInches(double meters){
        return meters * 39.37;
    }

    public static double convertInchesToMeters(double inches){
        return inches / 39.37;
    }
    public static double convertMiToKm(double mi){
        return mi * 1.609;

    }
    public static double kmToMeters(double km ){
        return km * 1000;
    }

}
