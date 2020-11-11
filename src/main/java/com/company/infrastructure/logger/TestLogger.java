package com.company.infrastructure.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class TestLogger {

    private int step = 0;

    protected String formatMessage(String msg){
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:SSS");
        String time = sdf.format(new Date());

        String procName = Thread.currentThread().getName();

        step++;

        return (step + ") " + time + " [" + procName + "]: " + msg);

    }

    public  abstract void log(String msg);
}

