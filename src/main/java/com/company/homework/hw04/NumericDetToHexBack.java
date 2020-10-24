package com.company.homework.hw04;

public class NumericDetToHexBack {
    public static void main(String[] args) {
        int i = 318;
        String k = decToHex (i);
        System.out.println(k);
        i = hexToDec(k);
        System.out.println(i);
    }

    public static String decToHex (int i){
        int ostatok;
        int[] myArray = new int[20];
        int j = 0;
        String k = "";


        while (i!=0){
            ostatok = i%16;
            myArray[j] = ostatok;
            i = i/16;
            j++;
        }
        for (int l = j-1; l > -1; l--) {
            if(myArray[l]<10){
                k += myArray[l];
            } else {
                switch (myArray[l]){
                    case 10: k += "A";
                        break;
                    case 11: k += "B";
                        break;
                    case 12: k += "C";
                        break;
                    case 13: k += "D";
                        break;
                    case 14: k += "E";
                        break;
                    case 15: k += "F";
                        break;
                }
            }
        }
        return k;
    }

    public static int hexToDec (String k){
        int s, n, p = 0,  i = 0;

        String y;
        for (s = k.length(); s > 0; s-- ){
            y = k.substring(s-1,s);

            switch (y) {
                case "A": n=10; break;
                case "B": n=11; break;
                case "C": n=12; break;
                case "D": n=13; break;
                case "E": n=14; break;
                case "F": n=15; break;
                default:  n = Integer.parseInt(y); break;
            }
            if (n==0){
                continue;
            }
            i = i + (int)Math.pow(16, p)*n;
            p++;
        }
        return i;
    }

}

