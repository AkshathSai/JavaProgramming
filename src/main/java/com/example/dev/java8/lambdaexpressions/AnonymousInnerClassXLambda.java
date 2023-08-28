package com.example.dev.java8.lambdaexpressions;

public class AnonymousInnerClassXLambda {

    public static void main(String[] args) {

        /** Interfaces cannot be used to instantiate new objects
         *  hence we need Anonymous Inner Classes
         */
        /*  Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10; i++) {
                    System.out.println("Child Thread");
                }
            }
        };

        Thread t = new Thread(r);
        t.start();*/

        /** We can replace the above Anonymous Inner Class with the
         *  below Lambda Expression
         */
        /*Runnable r = () -> {
            for (int i=0; i<10; i++) {
                System.out.println("Child Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();*/

        /** Instead of the Functional Interface Object,
         *  we can also pass Lambda Expression as an argument.
         */
        Thread t = new Thread(
                () -> {
                    for (int i =0; i<10; i++) {
                        System.out.println("Child Thread");
                    }
                }
        );

        t.start();

        for (int i =0; i<10; i++) {
            System.out.println("Main Thread");
        }

    }
}
