package com.company.homework.hw02;
import java.util.Random;
public class PrintDayInWord_1 {
    public static void main(String[] args) {
        //Написать программу с названием “PrintDayInWord”,
        //которая печатает “Sunday”, “Monday”, …. “Saturday”, если переменная “day”
        //типа int будет 1, 2, 3, 4 … 7. В противном случае программа должна вывести “Not a valid day”.
        //Решить задачу двумя способами:
        //
        //1) с использованием if..else if
        //
        //2) с использованием switch-case

        int day = new Random().nextInt(14);
        System.out.println(day);
        System.out.println();

            if (day == 1){
                System.out.println("Monday");
            } else if (day == 2){
                System.out.println("Tuesday");
            } else if (day == 3){
                System.out.println("Wednesday");
            } else if (day == 4){
                System.out.println("Thursday");
            } else if (day == 5){
                System.out.println("Friday");
            } else if (day == 6){
                System.out.println("Saturday");
            } else if (day == 7){
                System.out.println("Sunday");
            } else {
                System.out.println("Not a valid day");
            }

    }
}

