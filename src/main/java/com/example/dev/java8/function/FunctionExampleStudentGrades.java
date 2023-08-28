package com.example.dev.java8.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExampleStudentGrades {

    public static void main(String[] args) {

        ArrayList<Student> l = new ArrayList<Student>();
        populate(l);

        Function<Student, String> f = s -> {
            int marks = s.getMarks();
            if(marks > 80) {
                return "A[Distinction]";
            } else if (marks >= 60) {
                return "B[First Class]";
            } else if (marks >= 50) {
                return "C[Second Class]";
            } else if (marks >= 35) {
                return "D[Third Class]";
            } else {
                return "E[Failed]";
            }
        };

        //Predicate condition to check for student with marks greater than 60
        Predicate<Student> p = s -> s.getMarks()>=60;

        for (Student s: l) {
            if (p.test(s)) {
                System.out.println("Name: " + s.getName());
                System.out.println("Marks: " + s.getMarks());
                System.out.println(f.apply(s));
                System.out.println();
            }
        }

    }

    private static void populate(ArrayList<Student> l) {
        l.add(new Student("Akshath", 95));
        l.add(new Student("Charishma", 80));
        l.add(new Student("Viny", 38));
        l.add(new Student("Susmitha", 49));
        l.add(new Student("Varshith", 32));
        l.add(new Student("Yathin", 98));
        l.add(new Student("Bunny", 24));
    }

}
