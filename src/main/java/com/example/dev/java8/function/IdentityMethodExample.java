package com.example.dev.java8.function;

import java.util.function.Function;

public class IdentityMethodExample {

    public static void main(String[] args) {

        //The identity() method in Function always returns its input arguments
        Function<String, String> f = Function.identity();
        System.out.println(f.apply("AkshathSai"));
    }
}
