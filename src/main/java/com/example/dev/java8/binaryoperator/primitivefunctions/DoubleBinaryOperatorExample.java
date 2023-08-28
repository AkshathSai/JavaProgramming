package com.example.dev.java8.binaryoperator.primitivefunctions;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorExample {

    public static void main(String[] args) {

        /**
         * No AutoBoxing & AutoUnboxing overhead
         * Hence, results in good performance
         */
        DoubleBinaryOperator f = (d1, d2) -> d1+d2;
        System.out.println(f.applyAsDouble(2.4, 5.6));
    }

}
