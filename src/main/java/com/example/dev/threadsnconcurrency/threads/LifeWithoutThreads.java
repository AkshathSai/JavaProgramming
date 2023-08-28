package com.example.dev.threadsnconcurrency.threads;

public class LifeWithoutThreads {

    public static void main(String[] args) {

        System.out.println("Good old Sequential Life!");

        //Task-1
        System.out.println("Task-1 Kicked off");
        for (int i=101; i<199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask-1 done!");

        //Task-2
        System.out.println("Task-2 Kicked off");
        for (int i=201; i<299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask-2 done!");

        //Task-3
        System.out.println("Task-3 Kicked off");
        for (int i=301; i<399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask-3 done!");

        //Task-4
        System.out.println("Task-4 Kicked off");
        for (int i=401; i<499; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask-4 done!");

        System.out.println("Main done!");
    }

}
