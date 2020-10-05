package com.company.homework.hw01;

public class MarksConversions {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Недостаточно параметров. Надо 2");
        } else {
            System.out.print(Double.valueOf(args[0]) / Double.valueOf(args[1]) * 100);
            System.out.println("%");
        }
    }
}
