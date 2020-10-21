package com.company.homework.hw03;

public class FibonacciNumbers9 {
    public static void main(String[] args) {

        //9. Напишіть програму, яка друкуватиме всі числа Фібоначчі до вказаного числа

        int w = 187;
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;

        for (int i=0; f3 < w; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;

            System.out.print(f1 + " ");
        }
    }
}
