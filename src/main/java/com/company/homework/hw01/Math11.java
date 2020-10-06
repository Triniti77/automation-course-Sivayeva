package com.company.homework.hw01;
import static java.lang.Math.*;

public class Math11 {
    public static void main(String[] args) {
        double x = 65;

        double y = (2 * PI * x) - abs(sin(sqrt(10.5 * x))) * 1.0/pow(pow(x,2) + 1.0/7, 1.0/3);

        System.out.println(y);

    }
}
