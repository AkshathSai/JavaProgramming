package com.example.dev.java8.methodreference;

public class Test2 {

    public void m1() {
        for (int i = 0; i<10; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {

        Test2 test = new Test2();
        //Object reference::method name since m1 is non-static method
        Runnable r = test::m1;
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i<10; i++) {
            System.out.println("Main Thread");
        }

    }

}
