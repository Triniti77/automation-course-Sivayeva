package com.company.homework.hw07;

import com.company.homework.hw07.FractionNumber;

public class TestFarNumb {
    public static void main(String[] args) {

        FractionNumber fr1 = new FractionNumber(5, 8);
        FractionNumber fr2 = new FractionNumber(4,9);

        FractionNumber fr3 = fr1.plus(fr2);
        FractionNumber fr4 = fr1.minus(fr2);
        FractionNumber fr5 = fr1.multiply(fr2);
        FractionNumber fr6 = fr1.divide(fr2);
        System.out.println(fr1 + " fr1");
        System.out.println(fr2 + " fr2");
        System.out.println(fr3);
        System.out.println(fr4);
        System.out.println(fr5);
        System.out.println(fr6);

    }

}
