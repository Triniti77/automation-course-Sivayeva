package com.company.homework.hw02;
import java.util.Random;

public class Exercise_5 {
    public static void main(String[] args) {
        // Написать программу, которая сравнивает два числа типа int и определяет, какое из чисел большее,
        //а какое меньшее. Программа должна вывести что-то типа “The number x has the greatest value”.
        //Где “x” одно из чисел


        int number_one = new Random().nextInt(14);
        System.out.println(number_one);
        int number_two = new Random().nextInt(14);
        System.out.println(number_two);

        System.out.println();

        if (number_one == number_two){
            System.out.println("Values are equal");
        } else if (number_one > number_two) {
            System.out.println("The number_one has the greatest value");
        } else  {
            System.out.println("Number_one has the smallest value");
        }





    }
}
