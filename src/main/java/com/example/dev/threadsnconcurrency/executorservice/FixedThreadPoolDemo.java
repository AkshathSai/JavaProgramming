package com.example.dev.threadsnconcurrency.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Runnable is used for executing Tasks that doesn't return any values
 */
class Task extends Thread {

    private int taskNumber;

    public Task(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {

        System.out.println("\nTask " + taskNumber + " Kicked off!");

        for (int i = taskNumber * 100; i < taskNumber*100 + 99; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask " + taskNumber + " done!");
    }

}

public class FixedThreadPoolDemo {

    public static void main(String[] args) {

        /**
         * Customizing number of threads using newFixedThreadPool
         */
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));
        executorService.execute(new Task(8));
        executorService.execute(new Task(9));
        executorService.execute(new Task(10));

        executorService.shutdown();
    }

}
