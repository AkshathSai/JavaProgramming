package com.example.dev.java8.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdZonedDateTime {

    public static void main(String[] args) {

        //To get current system time zone
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);


        //Get the current time of America timezone
        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zdt = ZonedDateTime.now(la);
        System.out.println(zdt);

    }

}
