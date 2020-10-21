package com.company.homework.hw04;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {

        double a = 0;
        double b = 9;
        double c = 8;
        double d = discriminant(b, a, c);
        double x = variableX(c,b);
        double x1 = variableX1(b, d, a);
        double x2 = variableX2 (b, d, a);


        d = discriminant(b, a, c);
        System.out.println("d = " + d);


        if (a == 0 && b ==0 && c == 0) {
            System.out.println("все нули");
        }

        if ( a == 0) {
            x = variableX(c,b);
            System.out.println("x = " + x);
        }

        else if (d < 0){
            System.out.println("решений нет");
        } else if (d == 0 ){
            x1 = variableX1(b, d, a);
            System.out.println(x1 + " х1 == х2");
        } else {
            x1 = variableX1(b, d, a);
            x2 = variableX2 (b, d, a);

            System.out.println("в уравнении два корня" + "x1 = " + x1 + "x2 = " + x2 );
        }

    }
        public  static double discriminant(double b, double a, double c){
        return (pow(b,2)) - (4 * a * c);
        }

        public  static double variableX(double c, double b){
        return -c/b;
        }

        public  static double variableX1(double b, double d,double a){
        return (-b + sqrt(d))/(2*a);
        }

        public  static double variableX2 (double b,double d,double a){
        return (-b - sqrt(d))/(2*a);
        }


}
