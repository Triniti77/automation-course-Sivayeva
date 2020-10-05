package com.company.homework.hw01;
import java.util.*;

public class GeneralApplications {
    public static void main(String args[]) {
        System.out.println(System.currentTimeMillis());

        long millis = System.currentTimeMillis();
        long second = millis/1000;
        long minute = second/60;
        long hours = minute/60;
        long day = hours/24;
        long week = day/7;
        long months = day/30;
        long year = day/365;

        System.out.println(millis);
        System.out.println(second);
        System.out.println(minute);
        System.out.println(hours);
        System.out.println(day);
        System.out.println(week);
        System.out.println(months);
        System.out.println(year);

        year  = 34;
        months = year * 12;
        week = year * 52;
        day = year * 365 ;
        hours = 24 * day;
        minute = hours *60;
        second = minute * 60;

        System.out.println(second);
        System.out.println(minute);
        System.out.println(hours);
        System.out.println(day);
        System.out.println(week);
        System.out.println(months);
        System.out.println(year);
    }
}