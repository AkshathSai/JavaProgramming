package com.example.dev.java8.streams;

import java.util.ArrayList;

public class MinMaxMethods {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(10);
        al.add(5);
        al.add(25);
        al.add(15);
        al.add(20);

        System.out.println(al);

        //Default Natural sorting order comparator object (Ascending order) -> i1.compareTo(i2)
        Integer min = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Minimum value is: " + min);

        //Customised sorting comparator object
        Integer max = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Maximum value: "+ max);
    }

}
