package com.example.dev.java8.bifunction;

import java.util.function.BiFunction;

public class MultiplicationOfTwoNumbers {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a*b;
        System.out.println(biFunction.apply(10, 20));
        System.out.println(biFunction.apply(100, 200));
    }
}
