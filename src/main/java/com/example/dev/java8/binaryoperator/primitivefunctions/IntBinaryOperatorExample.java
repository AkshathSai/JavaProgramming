package com.example.dev.java8.binaryoperator.primitivefunctions;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorExample {

    public static void main(String[] args) {

        /**
         * No AutoBoxing & AutoUnboxing overhead
         * Hence, results in good performance
         */
        IntBinaryOperator f = (i1, i2) -> i1 + i2;
        System.out.println(f.applyAsInt(2, 3));

    }
}
