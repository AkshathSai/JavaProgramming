package com.example.dev.java8.primitivefunctionalinterfaces.predicatefunctions;

import java.util.function.LongPredicate;

public class LongPredicateExample {

    public static void main(String[] args) {

        long[] x = {1265, 2623, 13535, 15892, 17432, 243475, 253472, 3434253};

        //Even number check
        LongPredicate lp = l -> l%2==0;

        for (long x1: x) {
            if (lp.test(x1)) {
                System.out.println(x1);
            }
        }

    }

}
