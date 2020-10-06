package com.company.homework.hw01;
import static java.lang.Math.*;

public class Math13 {
    public static void main(String[] args) {
        double x = 79;

        double y = (pow( pow (E, -2), 1.0/5)) * 1.0/(sqrt(pow(x,2)+pow(x,4) + log(abs(x - 3.14))));

        System.out.println(y);
    }
}
