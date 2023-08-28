package com.example.dev.java8.anonymousinnerclassvslambda;

public class TestLambda {

    int x = 999; //instance variable

    public void m2() {

        Interf i = () -> {

            int x = 999; //acts as local variable

            /**Because there is no object store available,
             * this refers to current outer class members in lambda exprn.*/
            System.out.println(this.x);

        };

        i.m1();
    }

}
