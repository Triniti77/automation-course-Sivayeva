package com.company.homework.hw03;

public class CalculatesTheSumOfTwoColumns8 {
    public static void main(String[] args) {

        //8. Write a program which calculates the sum of two columns.
        //Print table if columns have the same size.
        //	| row_1 | row_2 | sum	|
        //	|  2	 | 5	    | 7	|
        //Otherwise print which column has bigger size

        int[] array = new int[]   {1, 3, 4, 2, 5, 6};
        int[] array_1 = new int[] {3, 4, 2, 4, 5, 9}; //7,8,5};

        if (array.length == array_1.length) {
            System.out.println("Print table");
            for (int i=0; i<array.length; i++) {
                System.out.println("|" + array[i] + "|" + array_1[i] + "|" + (array[i] + array_1[i]) + "|");
            }
        } else {
            System.out.println("Otherwise print which column has bigger size");
            System.out.println(array.length > array_1.length
                    ? "The first longer, length = " + array.length
                    : "The second longer,  length  =" + array_1.length);
        }
    }
}
