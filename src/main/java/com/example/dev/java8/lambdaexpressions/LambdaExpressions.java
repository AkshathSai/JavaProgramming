package com.example.dev.java8.lambdaexpressions;

public class LambdaExpressions {

    public static void main(String[] args) {

        HelloInterface hello = () -> System.out.println("Hello World");
        hello.m1();

        AddInterface ai = (a, b) -> System.out.println("The sum is: "+ (a+b));
        ai.add(10,20);
        ai.add(100, 300);

        LengthInterface li = s -> s.length();
        System.out.println(li.getLength("Hello"));
        System.out.println(li.getLength("With Lambda Expression"));

        SquareInterface si = a -> a*a;
        System.out.println("The square root is: " + si.squareit(4));
        System.out.println("The square root is: " + si.squareit(6));

        //Threads Example
        Runnable r = () -> {
            //Newly created Child Thread
            for (int i =0; i<10; i++) {
                System.out.println("Lambda Child Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();

        //Main method Thread
        for (int i=0; i<10; i++) {
            System.out.println("Main Thread");
        }

    }

}
