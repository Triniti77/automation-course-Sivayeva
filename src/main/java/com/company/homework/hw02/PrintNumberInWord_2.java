package com.company.homework.hw02;
import java.util.Random;
public class PrintNumberInWord_2 {
    // Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”, “TWO”, …,
    // “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, … 9,
    // или любой другой. Решить задачу двумя способами:
    //
    //1) с использованием if..else if
    //
    //2) с использованием switch-case

    public static void main(String[] args) {
        int number = new Random().nextInt(15);
        System.out.println(number);
        System.out.println();

        switch (number){

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
        System.out.println();
        System.out.println("The End");


    }
}
