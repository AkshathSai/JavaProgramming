package com.example.dev.java8.optional;

import java.util.List;
import java.util.Optional;

public class PlayingWithOptional {

    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "mango");

        Optional<String> optional = fruits.stream()
                .filter(fruit -> fruit.startsWith("b"))
                .findFirst();

        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
    }
}
