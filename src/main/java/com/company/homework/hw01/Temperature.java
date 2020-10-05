package com.company.homework.hw01;

public class Temperature {
    public static void main(String args[]){
        double degreesC = 100.0; // градусы цельсія
        // Цельсий х 1,8 + 32 = Фаренгейт
        //Celsius = 5/9 (F - 32) Kelvin = C + 273.16
        double resultF = degreesC * 9.0/5 + 32; // цельсія в фаренгейта
        System.out.println(resultF);

        double degreesF = resultF;
        double resultC = 5.0/9 * (degreesF - 32);
        System.out.println(resultC);

        degreesC = resultC;
        double resultK = degreesC + 273.16;
        System.out.println(resultK);

        double meters = 5.0;
        double inches = meters * 39.37;
        System.out.println(inches);

        meters = inches / 39.37;
        System.out.println(meters);

        double mi = 10.0;
        double km = mi * 1.609;
        System.out.println(km);

        mi = km / 1.609;
        System.out.println(mi);

        double Kg = 13.0;
        double lb = Kg * 2.2046;
        System.out.println(lb);

        Kg = lb / 2.2046;
        System.out.println(Kg);

        double km_hr = 1.0;
        double speed = km_hr * 0.6214;
        System.out.println(speed);

        km_hr = speed / 0.6214;
        System.out.println(km_hr);







    }
}
