package com.company.homework.hw03;

import java.util.Arrays;

public class SortAnArray5 {
    public static void main(String[] args) {

        // 5. Сортування масиву від мин до макс

        int arr[] = new int[10];
        for(int i = 0; i <  arr.length; i++) {
            arr[i] =  (int)(Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");

        Arrays.sort(arr);

        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
