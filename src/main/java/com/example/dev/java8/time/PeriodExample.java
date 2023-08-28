package com.example.dev.java8.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(1989, 8, 28);

        LocalDate today = LocalDate.now();

        Period p = Period.between(birthDate, today);

        System.out.printf("Your Age is %d years %d months & %d days", p.getYears(), p.getMonths(), p.getDays());

        LocalDate deathday = LocalDate.of(1989+60, 06, 15);

        Period p1 = Period.between(today, deathday);

        int d = p1.getYears()*365+p1.getMonths()*30+p1.getDays();

        System.out.printf("\nYou will be on the earth only %d Days...Hurry up to do important things", d);

    }
}
