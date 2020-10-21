package com.company.homework.hw04;

public class Temperature {

    public static void main(String[] args) {
        double resultF = convertCelsiusToFarengeit(70);
        System.out.println(resultF);
        double resultC = convertFarengeitToCelsius(resultF);
        System.out.println(resultC);
        double resultK = convertCelsiusToKel(resultC);
        System.out.println(resultK);
        resultC = convertKelToCelsius(resultK);
        System.out.println(resultC);

    }

    public static double convertCelsiusToFarengeit(double degreesC) {
        return degreesC * 9.0 / 5 + 32;
    }

    public static double convertFarengeitToCelsius(double degreesF) {
        return 5.0 / 9 * (degreesF - 32);
    }

    public static double convertCelsiusToKel(double degreesC) {
        return degreesC + 273.16;
    }

    public static double convertKelToCelsius(double degreesK) {
        return degreesK - 273.16;
    }




}
