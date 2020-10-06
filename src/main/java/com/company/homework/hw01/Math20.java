package com.company.homework.hw01;
import static java.lang.Math.*;

public class Math20 {
    public static void main(String[] args) {
        double x = 0.67;

        double y = (pow(pow(log(1),2) * x ,1.0/3) + tan(cos(PI*x)) ) * abs(log(x/10.5 + 1.0/3));

        System.out.println(y);
    }
}
