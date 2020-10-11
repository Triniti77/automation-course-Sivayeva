package com.company.homework.hw02;
import java.util.Random;
public class PrintDayInWord_2 {
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

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
                break;

        }



    }
}
