package com.example.dev.java8.example;

import java.util.List;

public class FunctionalApproach1 {

    public static void main(String[] args) {

        /**
         * Java 8 - Arrays.asList
         * Java 9 - List.of()
         */
        List<Integer> numbers = List.of(2, 9, 6, 5 ,4 ,3 , 7, 12, 6, 2, 3, 7, 8, 4, 2);
        //printAllNumbersInListFunctional(List.of(2, 9, 6, 5 ,4 ,3 , 7, 12, 6, 2, 3, 7, 8, 4, 2));
        //printAllNumbersInListFunctional(numbers);
        System.out.println("Even numbers in List: ");
        printEvenNumbersInListFunctional(numbers);
        System.out.println("\nSquares of Even numbers in List: ");
        printSquaresOfEvenNumbersInListFunctional(numbers);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //[2, 9, 6, 5 ,4 ,3 , 7, 12, 6, 2, 3, 7, 8, 4, 2]
        //2
        //9
        //....

        /**
         * In Functional Approach we define the behaviour
         * instead of getting List of elements we get stream of elements &
         * instead of calling the forEach(print(s));
         * we define the behaviour by using method reference forEach(FunctionalApproach1::print);
         */
        //What to do?
        numbers.stream()
                .forEach(System.out::println);
                //.forEach(FunctionalApproach1::print); //Method reference
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

        //What to do?
        numbers.stream()
                //Filter - Only Allow Even numbers
                //.filter(FunctionalApproach1::isEven) // Only if this is true it will go to the next line
                .filter(number -> number%2==0) //Lambda expression
                .forEach(System.out::println);
        //.forEach(FunctionalApproach1::print); //Method reference
    }

    /*private static boolean isEven(int number) {
        return number%2==0;
    }*/

   /* private static void print(int number) {
        System.out.println(number);
    }*/

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream() //Convert to a Stream
                .filter(number -> number % 2 == 0) //Lambda expression
                .map(number -> number * number) // Mapping each element with the square of the element
                .forEach(System.out::println); //Method reference
    }

}
