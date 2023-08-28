package com.example.dev.java8.predicate;

import java.util.function.Predicate;

public class PredicateIsEqual {

    public static void main(String[] args) {

        Predicate<String> p = Predicate.isEqual("Akshath");

        System.out.println(p.test("Charishma")); //false
        System.out.println(p.test("Akshath")); //true

    }
}
