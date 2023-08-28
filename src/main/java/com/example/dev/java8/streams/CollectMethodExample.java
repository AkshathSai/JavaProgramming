package com.example.dev.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethodExample {

    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<String>();
        l.add("Akshath");
        l.add("Vinay");
        l.add("Charishma");
        l.add("Sushmitha");
        l.add("SpringHATEOAS");
        System.out.println(l);

        List<String> l1 = l.stream().filter(s -> s.length()>=9).collect(Collectors.toList());
        System.out.println(l1);

        List<String> l2 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);
    }
}
