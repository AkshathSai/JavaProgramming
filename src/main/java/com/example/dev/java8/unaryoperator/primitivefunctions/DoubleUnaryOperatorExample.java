package com.example.dev.java8.unaryoperator.primitivefunctions;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorExample {

    public static void main(String[] args) {

        /**
         * No AutoBoxing & AutoUnboxing overhead
         * Hence, results in good performance
         */
        DoubleUnaryOperator f = d -> d*d;
        System.out.println(f.applyAsDouble(25.5));
    }

}
