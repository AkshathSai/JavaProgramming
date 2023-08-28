package com.example.dev.java8.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        //BiConsumer takes two input arguments and returns void.
        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1+s2); //accept method lambda
        biConsumer.accept("Akshath", "Sai");
    }

}
