package com.company.homework.hw03;

public class CharsForRange10 {
    public static void main(String[] args) {

        // 10. Напишіть програму, яка друкує всі символи для діапазону вводів 0 ... 127

        for (char i=0; i < 127; i++){
            String e = (int)i + " = " + i;
            System.out.println(e);
        }
    }
}

