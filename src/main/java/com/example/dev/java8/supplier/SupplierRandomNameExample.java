package com.example.dev.java8.supplier;

import java.util.function.Supplier;

public class SupplierRandomNameExample {

    public static void main(String[] args) {

        //Get a random name from index 0 to 3 of names Array
        Supplier<String> s = () -> {
            String [] names = {"Akshath", "Charishma", "Vinay", "Susmitha"};

            int x = (int) (Math.random() * 3); //generates a random number between O to 4

           return names[x];
        };

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());


    }
}
