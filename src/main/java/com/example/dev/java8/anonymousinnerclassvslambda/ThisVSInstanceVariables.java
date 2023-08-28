package com.example.dev.java8.anonymousinnerclassvslambda;

public class ThisVSInstanceVariables {

    public static void main(String[] args) {

        TestLambda tl = new TestLambda();
        tl.m2();

        TestAnonymousInnerClass tai = new TestAnonymousInnerClass();
        tai.m2();

    }
}
