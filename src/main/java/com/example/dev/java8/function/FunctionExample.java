package com.example.dev.java8.function;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        //Function to check the length of the String
        Function<String, Integer> f = s ->s.length();

        System.out.println(f.apply("Akshath"));
        System.out.println(f.apply("Java"));

        //Function to find square root of a number
        Function<Integer, Integer> f1 = i -> i * i;
        System.out.println(f1.apply(5));
        System.out.println(f1.apply(10));

        //Function to remove spaces between words
        String name = "Akshath Sai Pittala";
        Function<String, String> f2 = s -> s.replaceAll(" ","");
        System.out.println(f2.apply(name));

        //Function to count the number of blank spaces between the words
        Function<String, Integer> f3 = s -> s.length() - s.replaceAll(" ", "").length();
        System.out.println(f3.apply(name));

    }

}
