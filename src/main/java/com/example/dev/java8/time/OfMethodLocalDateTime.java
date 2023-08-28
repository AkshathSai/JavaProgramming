package com.example.dev.java8.time;

import java.time.LocalDateTime;
import java.time.Month;

public class OfMethodLocalDateTime {

    public static void main(String[] args) {

        //Month format can 05 or Month.MAY
        LocalDateTime dt = LocalDateTime.of(1995, Month.MAY, 28, 12, 45 );

        System.out.println(dt);
        System.out.println("After six months: " + dt.plusMonths(6));
        System.out.println("Before six months: " + dt.minusMonths(6));

    }

}
