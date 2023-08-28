package com.example.dev.java8.streams;

import java.util.ArrayList;

public class ToArrayExample {

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(7);
        l.add(9);
        l.add(12);

        System.out.println(l);

        Integer[] array = l.stream().toArray(Integer[]::new);


    }
}
