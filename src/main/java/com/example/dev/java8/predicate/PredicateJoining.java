package com.example.dev.java8.predicate;

import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String[] args) {

        int x[] = {0, 2, 5, 10, 15, 36, 53, 63, 72};

        //Predicate to check numbers greater than 10
        Predicate<Integer> p1 = i -> i>10;
        //Predicate to check the given number is even or not
        Predicate<Integer> p2 = i -> i%2==0;

        System.out.println("The numbers Greater than 10 are:");
        m1(p1, x);
        System.out.println("The even numbers are:");
        m1(p2, x);
        System.out.println("The numbers not greater than 10 are:");
        m1(p1.negate(), x);
        System.out.println("The numbers Greater than 10 and Even are:");
        m1(p1.and(p2), x);
        System.out.println("The numbers Greater than 10 or Even numbers are:");
        m1(p1.or(p2), x);
    }


    private static void m1(Predicate<Integer> p1, int[] x) {

        for (int x1: x) {
            if(p1.test(x1)) {
                System.out.println(x1);
            }
        }

    }

}
