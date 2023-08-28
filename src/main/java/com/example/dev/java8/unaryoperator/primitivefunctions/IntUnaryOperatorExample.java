package com.example.dev.java8.unaryoperator.primitivefunctions;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorExample {

    public static void main(String[] args) {

        /**
         * No AutoBoxing & AutoUnboxing overhead
         * Hence, results in good performance
         */
        IntUnaryOperator f = i -> i*i;
        System.out.println(f.applyAsInt(20));

    }
}
