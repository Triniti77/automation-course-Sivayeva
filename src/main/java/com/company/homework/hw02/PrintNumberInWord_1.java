package com.company.homework.hw02;
import java.util.Random;
public class PrintNumberInWord_1 {

    // Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”, “TWO”, …,
    // “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, … 9,
    // или любой другой. Решить задачу двумя способами:
    //
    //1) с использованием if..else if
    //
    //2) с использованием switch-case

    public static void main(String[] args) {
        int number = new Random().nextInt(13);
        System.out.println(number);

        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("OTHER");
        }

    }
}
