package com.company.homework.hw04;

public class NumericDetToBinBack {
    public static void main(String[] args) {

        int i = 3454355;
        String k = decToBin (i);
        System.out.println();
        System.out.println(k);
        i = binToDec(k);
        System.out.println(i);

        i = 6565555;
        k = decToBin(i);
        System.out.println(k);
        i = binToDec(k);
        System.out.println(i);

        i = 643;
        k = decToBin(i);
        System.out.println(k);
        i = binToDec(k);
        System.out.println(i);
    }

    public static String decToBin (int i){
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
            //System.out.print(ostatok);
        }
        for (int l = j-1; l > -1 ; l--) {
            if(myArray[l]<10){
                k += myArray[l];
            }
        }
        return k;
    }

    public static int binToDec (String k ){
       int i = 0;
       int s;
       String y;
       int n;
        for (s = k.length(); s>0; s--) {
            y = k.substring(s-1, s);
            n = Integer.parseInt(y);
            if (n == 0) {
                continue;
            }
            i = i + (int)Math.pow(2, k.length() - s);
//            System.out.println(i);
        }
       return i;
    }
}
