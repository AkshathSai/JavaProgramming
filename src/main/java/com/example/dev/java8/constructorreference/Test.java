package com.example.dev.java8.constructorreference;

public class Test {

    public static void main(String[] args) {

        //Constructor Reference
        Interf i = Sample::new;
        i.get();

    }
}
