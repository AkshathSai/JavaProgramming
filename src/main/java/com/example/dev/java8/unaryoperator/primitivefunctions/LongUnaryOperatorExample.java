package com.example.dev.java8.unaryoperator.primitivefunctions;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorExample {

    public static void main(String[] args) {

        /**
         * No AutoBoxing & AutoUnboxing overhead
         * Hence, results in good performance
         */
        LongUnaryOperator f = l -> l*l;
        System.out.println(f.applyAsLong(36));
    }

}
