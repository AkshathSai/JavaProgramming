package com.example.dev.java8.time;

import java.time.LocalDate;

public class CustomDateFormat {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        //Original Format
        System.out.println("Original Format \n" + date);

        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();

        System.out.println(dd + "..." + mm + "..." + yyyy);

        //Customised Format
        System.out.printf("Customised Format: %d-%d-%d \n", dd, mm, yyyy);

    }

}
