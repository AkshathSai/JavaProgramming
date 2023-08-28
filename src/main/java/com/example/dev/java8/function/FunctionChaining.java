package com.example.dev.java8.function;

import java.util.function.Function;

public class FunctionChaining {

    public static void main(String[] args) {

        //Function to Convert given String to uppercase
        Function<String, String> f1 = s -> s.toUpperCase();

        //Function to select first 9 characters of a String
        Function<String, String> f2 = s -> s.substring(0, 9);

        System.out.println("The result of f1: " + f1.apply("Akshathsai"));
        System.out.println("The result of f2: " + f2.apply("Akshathsai"));
        //f1.andThen(f2) f1 will be applied followed by f2
        System.out.println("The result of f1.andThen(f2) :" + f1.andThen(f2).apply("Akshathsai"));
        //f1.compose(f2) f2 will be applied followed by f1
        System.out.println("The result of f1.compose(f2) :" + f1.compose(f2).apply("Akshathsai"));
    }

}
