package com.example.dev.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodExample {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(10);
        al.add(5);
        al.add(25);
        al.add(15);
        al.add(20);

        System.out.println(al);

        //For default natural sorting order (i.e. Ascending)
        List<Integer> l = al.stream().sorted().collect(Collectors.toList());
        System.out.println("After sorting");
        System.out.println(l);

        //Customized sorting - Descending order sorting
        List<Integer> l1 = al.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(l1);

        //Alternative way Customized sorting - Descending order sorting
        /*List<Integer> l1 = al.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(l1);*/
    }

}
