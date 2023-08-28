package com.example.dev.java8.bipredicate;

import java.util.function.BiPredicate;

public class SumOfTwoNumbersIsEvenOrNot {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> biPredicate = (a,b) -> (a+b) % 2 == 0;
        System.out.println(biPredicate.test(10,20)); //true
        System.out.println(biPredicate.test(15, 20)); //false
    }
}
