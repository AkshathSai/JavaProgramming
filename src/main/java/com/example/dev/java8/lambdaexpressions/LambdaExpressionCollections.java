package com.example.dev.java8.lambdaexpressions;

import java.util.*;

public class LambdaExpressionCollections {

    public static void main(String[] args) {

        /** Sorting the elements of List with
         * Lambda Expression in Descending order */
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(45);
        l.add(5);

        Collections.sort(l, (I1, I2) -> (I1>I2)?-1:(I1<I2)?1:0 );

        System.out.println(l);

        /** Passing the Comparator Object Lambda expression
         *  as a parameter to sort the elements of a Set in
         *  Descending order
         */
        TreeSet<Integer> t= new TreeSet<Integer>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2)? 1 : 0);
        t.add(10);
        t.add(15);
        t.add(20);
        t.add(45);
        t.add(5);

        System.out.println(t);


        /** Passing the Comparator Object Lambda expression
         *  as a parameter to sort the elements of a Map in
         *  Descending order
         */
        TreeMap<Integer, String> m = new TreeMap<Integer, String>( (I1,I2) -> (I1>I2)?-1:(I1<I2)?1:0 );
        m.put(700, "Charishma");
        m.put(500, "Susmitha");
        m.put(400, "Vinny");
        m.put(100, "Akshath");

        System.out.println(m);

        /** Sorting the elements of our Own class objects
         *  in Ascending order with Lambda Expression
         */
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(200, "Vinay"));
        al.add(new Employee(400, "Charishma"));
        al.add(new Employee(100, "Akshath"));
        al.add(new Employee(600, "Susmitha"));

        System.out.println("Before Sorting: "+ al); //Will Call the ToString method of the POJO class

        Collections.sort(al, (e1, e2) -> (e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);

        System.out.println("After Sorting: " + al);

        List<String> list = new ArrayList<>();
        list.add("Akshath");
        list.add("Charishma");
        list.add("Vinay");
        list.add("Susmitha");

        /** Iterator pattern (like)
         *  Invoking Consumer Functional interface accept method using Lambda expression
         */
        list.forEach(element -> System.out.println(element));

    }

}
