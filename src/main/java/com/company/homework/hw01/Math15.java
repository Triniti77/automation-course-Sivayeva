package com.company.homework.hw01;
import static java.lang.Math.*;

public class Math15 {
    public static void main(String[] args) {
        double x = 37;

        double y = (abs(x * log(x) - 4) * sqrt(x))* (1.0/pow(pow(E,4 * x) - 1.0, 1.0/5));

        System.out.println(y);
    }
}
