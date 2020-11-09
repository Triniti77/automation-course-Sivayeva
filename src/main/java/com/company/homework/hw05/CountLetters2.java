package com.company.homework.hw05;

public class CountLetters2 {
    public static void main(String[] args) {
        // 	2. Count letters
        //     Count the single character frequencies

        String proverb = "Beauty is in the eye of the beholder";
        System.out.println(proverb.length());

        long numberOfLetters = proverb
                .chars()
                .filter(Character::isLetter)
                .count();
        System.out.println(numberOfLetters);

        String proverbLow = proverb.toLowerCase();
        char[] provAr = proverbLow.toCharArray();
        int g = 0, g2 = 0, g3 = 0, g4 = 0, g5 = 0;

        for (int j = 0; j < provAr.length; j++){
            if (provAr[j]== 'a')
                g++;
            if (provAr[j]== 'b')
                g2++;
            if (provAr[j]== 'c')
                g3++;
            if (provAr[j]== 'd')
                g4++;
        }
        System.out.println("вся длина " + provAr.length);
        if (g>0){
            System.out.println("количество букв в предлож " + g);
        }

        String ro = "aBc Aaf";
        String roLower = ro.toLowerCase();
        char[] we = roLower.toCharArray();
        int my = 0, my2 = 0, my3 = 0, my4 = 0, my5 = 0;

        for (int i = 0; i<we.length; i++){
            if(we[i] == 'a')
                my++;
            if(we[i] == 'b')
                my2++;
            if(we[i] == 'c')
                my3++;
            if(we[i] == 'd')
                my4++;
        }
        System.out.println("вся длина " + we.length);
        if (my>0){
            System.out.println("количество бувк в предложении " + my);
        }

    }
}
