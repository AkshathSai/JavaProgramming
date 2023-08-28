package com.example.dev.java8.primitivefunctionalinterfaces.predicatefunctions;

import java.util.function.IntPredicate;

public class IntPredicateExample {

    public static void main(String[] args) {

        int[] x = {0, 2, 13, 15, 17, 20, 25, 34};

        //Even number check
        IntPredicate p = i -> i %2==0;

        for (int x1: x) {
            if (p.test(x1)) {
                System.out.println(x1);
            }
        }

    }

}
