package com.company.homework.hw02;
import static java.lang.Math.*;
import java.util.Random;

public class Exercise_7 {
    public static void main(String[] args) {

        //Написать программу которая будет сравнивать величину (magnitude) двух чисел. Например,
        // если одно число = 3, а второе число = -9, программа должна выдать, что число -9 имеет
        // большую величину.

        int magnitude_1 = new Random().nextInt(15) - 7;
        int magnitude_2 = new Random().nextInt(15) - 7;
        System.out.println(magnitude_1);
        System.out.println(magnitude_2);
        System.out.println();

        if ((abs(magnitude_1) == abs(magnitude_2))){
            System.out.println( magnitude_1 + "=" + magnitude_2 );
        }
        else if (abs(magnitude_1) > abs(magnitude_2)) {
            System.out.println( magnitude_1 + " - имеет большею величину");
        } else {
            System.out.println(magnitude_2 + " - имеет большею величину");
        }

    }
}
