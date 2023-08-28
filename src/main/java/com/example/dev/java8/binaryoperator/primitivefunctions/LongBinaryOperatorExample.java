package com.example.dev.java8.binaryoperator.primitivefunctions;

import java.util.function.LongBinaryOperator;

public class LongBinaryOperatorExample {

    public static void main(String[] args) {

        /**
         * No AutoBoxing & AutoUnboxing overhead
         * Hence, results in good performance
         */
        LongBinaryOperator f = (l1, l2) -> l1+l2;
        System.out.println(f.applyAsLong(200, 300));
    }
}
