package com.company.homework.hw03;

public class Palindrome6 {
    public static void main(String[] args) {

        // 6. Напишіть програму, яка перевіряє,
        // чи рядок (використовувати масив символів) є паліндромом
        // Mr. Owl ate my metal worm

        char [] palindrome =
                new char[] {'m','r',' ','o','w','l',' ','a','t',
                        'e',' ','m','y',' ','m', 'e','t','a','l',' ',
                        'w','o','r','m'};
        int i=0;
        int k=palindrome.length-1;
        while (i<k) {
            char t = palindrome[i];
            char f = palindrome[k];

            if (t == ' ') {
                i++;
                t = palindrome[i];
            }
            if (f == ' ') {
                k--;
                f = palindrome[k];
            }

            if (t != f) {
                System.out.println("не палиндром в позиции "+i+"-"+k);
                break;
            }
            i++;
            k--;
        }
        if ( i>= k) {
            System.out.println("это палиндром");
        }
    }
}
