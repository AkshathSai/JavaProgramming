package com.example.dev.java8.time;

import java.time.LocalTime;

public class CustomTimeFormat {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hh = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int nanosec = time.getNano();

        //H:M:S:NS
        System.out.printf("%d:%d:%d:%d", hh, min, sec, nanosec);

    }
}
