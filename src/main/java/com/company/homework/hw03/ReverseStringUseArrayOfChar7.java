package com.company.homework.hw03;

public class ReverseStringUseArrayOfChar7 {
    public static void main(String[] args) {

        // 7. Напишіть програму, яка друкує зворотний рядок (використовуйте масив char [] замість String)

        String st = "yppah eb ,yrrow t'noD";

        char symbols[] = st.toCharArray();

        for(int x= symbols.length-1; x>=0; x--) {

            System.out.print(symbols [x]);
        }
    }
}
