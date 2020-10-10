package com.company.homework.hw02;

public class Exercise_6 {
    public static void main(String[] args) {

         // Написать программу, которая бы решала уравнение вида a x + b = 0
        //
        //Переменные a и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
        // Программа должна также учитывать варианты, когда или а = 0 или b = 0


        double a = 2.0;
        System.out.println(a);
        double b = 7.0;
        System.out.println(b);
        System.out.println();

        if (a==0 || b==0){
            System.out.println("Zero");
        } else {
            double x = -b/a;
            System.out.println(x);
        }

    }



}
