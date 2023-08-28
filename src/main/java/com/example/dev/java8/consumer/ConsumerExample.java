package com.example.dev.java8.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        /**
         * Consumer is a Functional Interface which accepts a single input
         * argument and returns nothing i.e. void
         *
         * It contains a Single Abstract Method accept(T t);
         */
        Consumer<String> c = s -> System.out.println(s);
        c.accept("AkshathSai");
        c.accept("Vinay");

    }
}
