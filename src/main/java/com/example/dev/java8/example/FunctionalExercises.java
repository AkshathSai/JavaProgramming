package com.example.dev.java8.example;

import java.util.List;

public class FunctionalExercises {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 6, 4, 2, 12, 15);

        printOddNumbersInList(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        printAllCoursesIndividually(courses);

        printCoursesContainingSpring(courses);

        printCoursesWhoseNameIsFourCharacters(courses);
    }

    private static void printOddNumbersInList(List<Integer> numbers) {
        System.out.println("Odd numbers in the list:");
        //number -> number%2!=0 (or) number -> number%2==1 - Odd Number check condition
        numbers.stream().filter(number -> number%2!=0).forEach(System.out::println);
    }

    private static void printAllCoursesIndividually(List<String> courses) {
        System.out.println(" ");
        System.out.println("Printing List Individually");
        courses.forEach(System.out::println);
    }

    private static void printCoursesContainingSpring(List<String> courses) {
        System.out.println(" ");
        System.out.println("Contains the word Spring");
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }

    private static void printCoursesWhoseNameIsFourCharacters(List<String> courses) {
        System.out.println(" ");
        System.out.println("Has at least 4 characters");
        courses.stream().filter(course -> course.length()>=4).forEach(System.out::println);
    }
}
