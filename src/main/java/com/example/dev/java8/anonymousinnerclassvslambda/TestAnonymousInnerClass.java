package com.example.dev.java8.anonymousinnerclassvslambda;

public class TestAnonymousInnerClass {

    int x = 999; //instance variable

    public void m2() {

        Interf i = new Interf() {
            int x = 888; //acts as Instance variable

            @Override
            public void m1() {
                System.out.println(this.x); //Here this refers to current inner class object
            }
        };

        i.m1();

    }
}
