package com.company.homework.hw05;

public class CountWordsLength4 {
    public static void main(String[] args) {

        // 4. Count words of each length
        //Count the number of words of each length in some text.

        String str = "Beauty is in the eye of the beholder";

        int post1 = 0;
        int post2 = 0;

        int[] mas = new int[30];

        for (int f = 0; f < str.length(); f++) {
            if (str.charAt(f) == ' ') {
                post2 = f;
                int wordlen = post2 - post1; // word length
//                System.out.println(wordlen);
//                System.out.println(f);
                if (wordlen == 1) {
                    post1 = post2;
                    continue;
                }
                mas[wordlen]++;
                post1 = post2+1;
            }
        }

        post2 = str.length()-1;
        if ( post2 - post1 > 0) {
            mas[post2 - post1]++;
        }

        // вивести масив
        for (int i=1; i < mas.length; i++){
            if (mas[i] != 0){
                System.out.println(" количесво символов в слове " + i + " количество слов  - " + mas[i]);
            }
        }
    }
}