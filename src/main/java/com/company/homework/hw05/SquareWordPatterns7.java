package com.company.homework.hw05;

public class SquareWordPatterns7 {
    public static void main(String[] args) {


        String roy = "help";
        char[] provAr = roy.toCharArray();

        for (int i = 0; i < provAr.length; i++){
            for (int k = 0; k < provAr.length ; k++){
                int position = i+k < provAr.length? i+k: i+k -provAr.length;
                char c = provAr[position];
                System.out.println(c);

            }
            System.out.println();
        }

    }
}
