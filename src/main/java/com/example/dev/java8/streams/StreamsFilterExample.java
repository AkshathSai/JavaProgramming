package com.example.dev.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(7);
        l.add(9);
        l.add(12);

        System.out.println(l);

        //Filter only even numbers
        List<Integer> l1 = l.stream().filter(I -> I%2==0).collect(Collectors.toList());
        System.out.println(l1);

    }
}
