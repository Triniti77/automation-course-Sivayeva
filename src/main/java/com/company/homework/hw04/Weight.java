package com.company.homework.hw04;

public class Weight {
    public static void main(String[] args) {

        double lb = 13.0;
        double kg = lbTokg(lb);
        System.out.println(kg);
        lb = kgToLb (kg);
        System.out.println(lb);
    }

        public static double lbTokg (double lb){
            return lb / 2.2046;
        }

        public static double kgToLb (double kg){
            return kg * 2.2046;
        }


}
