package com.example.dev.java8.example;

import java.util.List;

public class StructuredApproach1 {

    public static void main(String[] args) {

        /**
         * Java 8 - Arrays.asList
         * Java 9 - List.of()
         */
        List<Integer> numbers = List.of(2, 9, 6, 5 ,4 ,3 , 7, 12, 6, 2, 3, 7, 8, 4, 2);
        //printAllNumbersInListStructured(List.of(2, 9, 6, 5 ,4 ,3 , 7, 12, 6, 2, 3, 7, 8, 4, 2));
        //printAllNumbersInListStructured(numbers);
        printEvenNumbersInListStructured(numbers);
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        //How to loop numbers?
        for (int number: numbers) {
            System.out.println(number);
        }

    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        //How to loop numbers?
        for (int number: numbers) {
            //if(even) check - traditional approach
            if(number%2 == 0) {
                System.out.println(number);
            }
        }

    }
}
