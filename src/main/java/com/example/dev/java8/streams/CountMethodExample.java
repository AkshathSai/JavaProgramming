package com.example.dev.java8.streams;

import java.util.ArrayList;

public class CountMethodExample {

    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<String>();
        l.add("Akshath");
        l.add("Vinay");
        l.add("Charishma");
        l.add("Sushmitha");
        l.add("SpringHATEOAS");
        System.out.println(l);

        //Print the number of elements whose length is greater than 9 characters
        long numberOfElements = l.stream().filter(s -> s.length()>=9).count();
        System.out.println(numberOfElements);
    }
}
