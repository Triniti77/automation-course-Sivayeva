package com.company.homework.hw05;
import java.util.Scanner;

public class CountTheWords3 {
    public static void main(String[] args) {

        //3. Count the words in some text

        String str = "Beauty is in the eye of the beholder";
        int coun = 0;
        if(str.length() !=0){
            coun++;
        }
        for (int f = 0; f < str.length(); f++){
            if (str.charAt(f) == ' '){
                coun++;
            }
        }
        System.out.println("количество слов " + coun);
    }
}
