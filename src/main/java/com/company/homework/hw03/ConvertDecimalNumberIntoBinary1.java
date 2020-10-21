package com.company.homework.hw03;
import org.w3c.dom.ls.LSOutput;
import java.util.Random;

public class ConvertDecimalNumberIntoBinary1 {

    public static void main(String[] args) {

    //1. 1. Write a program to convert decimal number into binary and back

        int i = 3454355;
        int ostatok;
        int[] myArray = new int[100];
        int j = 0;
        String k = "";
        //System.out.println(i + " - i");

        while (i!=0){
            ostatok = i%2;
            myArray[j] = ostatok;
            i = i/2;
            j++;
        //    System.out.print(ostatok);
        }
        for (int l = j-1; l > -1 ; l--) {
            if(myArray[l]<10){
                k += myArray[l];
            }

        }
        System.out.println();
        System.out.println(k);

//        k = "110111";
        i = 0;
        int s, n;
        String y;

        s = k.length(); // "110111" -> "1" -> int 1
        if (s > 0) {
            y = k.substring(s-1, s);
            n = Integer.parseInt(y);
            i = i + (int)Math.pow(2, k.length() - s);
            System.out.println(i);
        }

        s--; // "110111" -> "1" -> int 1
        if (s > 0) {
            y = k.substring(s-1, s);
            n = Integer.parseInt(y);
            i = i + (int)Math.pow(2, k.length() - s);
            System.out.println(i);
        }

        s--; // "110111" -> "1" -> int 1
        if (s>0) {
            y = k.substring(s-1, s);
            n = Integer.parseInt(y);
            i = i + (int)Math.pow(2, k.length() - s);
            System.out.println(i);
            System.out.println();
        }

        i = 0;
        for (s = k.length(); s>0; s--) {
            y = k.substring(s-1, s);
            n = Integer.parseInt(y);
            if (n == 0) {
                continue;
            }
            i = i + (int)Math.pow(2, k.length() - s);
//            System.out.println(i);
        }
        System.out.println(i);
    }
}


