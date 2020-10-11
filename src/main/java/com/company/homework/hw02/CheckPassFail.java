package com.company.homework.hw02;

import java.util.Random;

public class CheckPassFail {
    public static void main(String[] args) {

        int marc = new Random().nextInt(100);
        System.out.println(marc + " - age");

        if(marc >= 50){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
