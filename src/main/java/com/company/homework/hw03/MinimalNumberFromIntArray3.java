package com.company.homework.hw03;
import java.util.Random;
public class MinimalNumberFromIntArray3 {
    public static void main(String[] args) {

        //3. Напишіть програму, яка знаходить мінімальне число з масиву int

        int[] nums = new int[] {3,5,6,9};
        int min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (min > nums[i]){
                min = nums[i];
            }
        }
        System.out.println("Min number: "+ min);
    }
}
