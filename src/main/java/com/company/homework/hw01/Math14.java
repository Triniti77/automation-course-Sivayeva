package com.company.homework.hw01;
import static java.lang.Math.*;

public class Math14 {
    public static void main(String[] args) {
        double x = 54;

        double y =(sqrt(pow(sin(x/2), 2)) + pow( pow(E,1.3 * x) + pow(E, -1.3 * x), 1.0/3)) * 1.0/ abs(x + 5.0/2);

        System.out.println(y);
    }
}
