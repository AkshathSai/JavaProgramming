package com.example.dev.threadsnconcurrency.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        System.out.println("Task - 3 Kicked off");
        for (int i = 0; i < 299; i++)
            System.out.print(i + " ");
        System.out.println("\nTask - 3 done!");

        executorService.shutdown(); //Required step else program will run *like forever*
    }
}
