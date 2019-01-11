package com.amayadream.webchat.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonDate {

    public final String year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
    public final String month = String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1);
    public final String day = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
    public final String hour_24 = String.valueOf(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
    public final String hour_12 = String.valueOf(Calendar.getInstance().get(Calendar.HOUR));
    public final String minute = String.valueOf(Calendar.getInstance().get(Calendar.MINUTE));
    public final String second = String.valueOf(Calendar.getInstance().get(Calendar.SECOND));
    public final String week_of_year = String.valueOf(Calendar.getInstance().get(Calendar.WEEK_OF_YEAR));
    public final String week_of_month = String.valueOf(Calendar.getInstance().get(Calendar.WEEK_OF_MONTH));
    public final String day_of_year = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_YEAR));
    public final String day_of_month = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
    public final String day_of_week = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));


    public String getTime24(){
        Date date = new Date();
        SimpleDateFormat timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = timeStamp.format(date);
        return time;
    }

    public Long getStamp(){
        return System.currentTimeMillis() / 1000;
    }


    public String stamp2Time(long timeStamp){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(timeStamp * 1000));
    }


    public int getAge(int year){
        return Integer.parseInt(this.year) - year;
    }
}
