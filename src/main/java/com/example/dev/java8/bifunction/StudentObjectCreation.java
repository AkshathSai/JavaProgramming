package com.example.dev.java8.bifunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class StudentObjectCreation {

    public static void main(String[] args) {

        ArrayList<Student> l = new ArrayList<Student>();

        BiFunction<String, Integer, Student> biFunction = (name,rollno) -> new Student(name, rollno);
        l.add(biFunction.apply("Akshath", 1));
        l.add(biFunction.apply("Charishma", 2));
        l.add(biFunction.apply("Susmitha", 3));
        l.add(biFunction.apply("Vinay", 4));

        for (Student s: l) {
            System.out.print(s.getRollno());
            System.out.print(" ");
            System.out.println(s.getName());
        }

    }
}
