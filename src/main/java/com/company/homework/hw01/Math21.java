package com.company.homework.hw01;
import static java.lang.Math.*;

public class Math21 {
    public static void main(String[] args) {
        double x = 23;

        double y = ((pow(log(x),1.0/4) + acos(x + 3.0))) * 1.0/ (x + 2 * pow(x,2));

        System.out.println(y);
    }
}
