package com.company.homework.hw02;
import static java.lang.Math.*;


public class Exercise_8 {
    public static void main(String[] args) {
        //Написать программу, которая бы решала квадратное уравнение вида a x2+b x+c = 0
        //
        //Переменный a, b, c можно задать вручную. Программа должна учитывать варианты:
        //
        //1) когда a=0
        //
        //2) когда дискриминант < 0 - решений нет
        //
        //3) когда дискриминант = 0 - тогда х1 == х2
        //
        //4) когда дискриминант > 0 - тогда в уравнении два корня

        double a = 0;
        double b = 9;
        double c = 8;

        double d = (pow(b,2)) - (4 * a * c);
        System.out.println("d = " + d);


        if (a == 0 && b ==0 && c == 0) {
            System.out.println("все нули");
        }

        if ( a == 0) {
                double x = -c/b;
                System.out.println("x = " + x);
        }

        else if (d < 0){
            System.out.println("решений нет");
        } else if (d == 0 ){
            double x1 = (-b + sqrt(d))/(2*a);
            System.out.println(x1 + " х1 == х2");
        } else {
            double x1 = (-b + sqrt(d))/(2*a);
            double x2 = (-b - sqrt(d))/(2*a);

            System.out.println("в уравнении два корня" + "x1 = " + x1 + "x2 = " + x2 );
        }


    }
}