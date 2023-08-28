package com.example.dev.java8.time;

import java.time.Year;
import java.util.Scanner;

public class YearExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Year number");
        int n = sc.nextInt();

        Year year = Year.of(n);

        //Any year divisible by 4 is a leap year
        if(year.isLeap()) {
            System.out.println(n + " is a leap year");
        } else {
            System.out.println(n + " is not a leap year");
        }

    }
}
