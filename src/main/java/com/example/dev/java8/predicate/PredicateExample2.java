package com.example.dev.java8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample2 {

    public static void main(String[] args) {

        /** Predicate Example To display names that starts with 'K' */
        String[] names = {"Sushmita", "Vinay", "Kajal", "Charishma", "Katrina", "Akshath"};

        Predicate<String> startsWithK = s -> s.charAt(0) == 'K';

        System.out.println("The names starting with K are:");

        for (String s: names) {

            if (startsWithK.test(s)) {
                System.out.println(s);
            }

        }

        /** Predicate Example To remove null values
         *  and empty Strings from list */
        String namesList[] = {"Vinay", "", null, "Charishma", "", "Sushmitha", null };

        ArrayList<String> al = new ArrayList<String>();

        Predicate<String> p1 = s -> s!=null && s.length()!=0;

        for (String name: namesList) {

            if(p1.test(name)) {
                al.add(name);
            }
        }

        System.out.println("The list of valid Strings");
        System.out.println(al);

    }

}
