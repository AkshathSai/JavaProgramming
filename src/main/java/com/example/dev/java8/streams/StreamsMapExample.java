package com.example.dev.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(7);
        l.add(9);
        l.add(12);

        System.out.println(l);

        //Double the value of each element
        List<Integer> l1 = l.stream().map(I -> I*2).collect(Collectors.toList());
        System.out.println(l1);

    }

}
