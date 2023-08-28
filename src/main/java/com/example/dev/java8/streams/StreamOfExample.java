package com.example.dev.java8.streams;

import java.util.stream.Stream;

public class StreamOfExample {

    public static void main(String[] args) {

        //For a group of values
        Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
        s.forEach(System.out::println);

        //For Arrays
        Double[] d = {10.0, 10.1, 10.2, 10.3, 10.4, 10.5};
        Stream<Double> s1 = Stream.of(d);
        s1.forEach(System.out::println);

    }
}
