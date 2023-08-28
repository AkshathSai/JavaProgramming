package com.example.dev.java8.methodreference;

public class Test {

    public static void m2() {
        System.out.println("Method reference");
    }

    public static void main(String[] args) {

        //Referencing m2 method implementation to m1
        //className::method name since m2 is a static method
        Interf i = Test::m2;
        i.m1();
    }

}
