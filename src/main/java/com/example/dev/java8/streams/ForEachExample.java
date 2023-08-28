package com.example.dev.java8.streams;

import java.util.ArrayList;

public class ForEachExample {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("BB");
        al.add("CCC");

        //Using Lambda Expressions
        al.stream().forEach(s -> System.out.println(s));

        //Alternatively, we can replace lambda expressions with method reference as well
        al.stream().forEach(System.out::println);

    }
}
