package com.example.dev.java8.binaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        /**
         * BinaryOperator is the child interface of BiFunction
         * When the two input arguments and the return type are of same type
         * we can go for BinaryOperator
         */
        BinaryOperator<String> f = (s1, s2) -> s1+s2;
        System.out.println(f.apply("Akshath", "Sai"));

    }

}
