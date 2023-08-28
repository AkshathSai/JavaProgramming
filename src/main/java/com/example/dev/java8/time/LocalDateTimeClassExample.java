package com.example.dev.java8.time;

import java.time.LocalDateTime;

public class LocalDateTimeClassExample {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        //Date format
        int dd = dt.getDayOfMonth();
        int mm = dt.getMonthValue();
        int yy = dt.getYear();
        System.out.printf("%d-%d-%d", dd, mm , yy);

        //Time format
        int h = dt.getHour();
        int m = dt.getMinute();
        int s = dt.getSecond();
        int n = dt.getNano();

        System.out.printf("\n%d:%d:%d:%d", h, m, s, n);

    }
}
