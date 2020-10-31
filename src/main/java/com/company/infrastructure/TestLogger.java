package com.company.infrastructure;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TestLogger {

    private int step = 1;

    public void log(String msg){
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:SSS");
        String time = sdf.format(new Date());

        String procName = Thread.currentThread().getName();

        System.out.println(step + ") " + time + " [" + procName + "]: " + msg);
        step++;
    }
}
