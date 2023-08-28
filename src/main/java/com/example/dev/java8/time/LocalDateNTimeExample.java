package com.example.dev.java8.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateNTimeExample {

    public static void main(String[] args) {

        /**
         * now() factory method present in LocalTime, LocalDate classes
         */
        //To print Local Date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //To print Local system time
        LocalTime time = LocalTime.now();
        System.out.println(time);

    }

}
