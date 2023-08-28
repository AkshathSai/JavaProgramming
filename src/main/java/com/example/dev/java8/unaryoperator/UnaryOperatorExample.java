package com.example.dev.java8.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        /**
         * UnaryOperator is the child interface of Function Interface
         * If both the input type and return type are same then we can
         * go for UnaryOperator
         */
        UnaryOperator<Integer> f = i -> i*i;
        System.out.println(f.apply(10));
    }

}
