package com.example.dev.java8.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        /**Predicate is a Predefined Functional Interface and a
         * boolean value function that takes in the Type <T>
         * as an input argument and contains the test() method
         * the return type of test() is boolean
         * it is used to check some condition and return true or false
         */
        Predicate<Integer> p = I -> I>10;//Lambda Expression

        //Invoking the test() method of Predicate
        System.out.println(p.test(100));
        System.out.println(p.test(5));

        Predicate<String> p1 = s -> s.length()>5;

        System.out.println(p1.test("abcdef"));
        System.out.println(p1.test("abc"));

        Predicate<Collection> p2 = li -> li.isEmpty();

        ArrayList li = new ArrayList();
        li.add("A");
        System.out.println(p2.test(li)); //false

        ArrayList li2 = new ArrayList();
        System.out.println(p2.test(li2)); //true


    }

}
