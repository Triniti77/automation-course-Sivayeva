package com.company.homework.hw03;

import static java.lang.Math.PI;
import static java.lang.Math.sin;

public class ResultsForSinx4 {
    public static void main(String[] args) {

            //4. Напишіть програму, яка друкує таблицю всіх результатів для sin (x), де x дорівнює кожним 10
            //градусам від 0 до 360

        for (int i = 0; i <= 360; i += 10) {
            System.out.println(i);

            double x, y;
            x = i * PI /180;
            System.out.println(x + " = x");
            y = sin(x);
            System.out.println(y + " = y ");
        }
    }
}



