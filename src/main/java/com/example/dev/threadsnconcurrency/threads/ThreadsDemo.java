package com.example.dev.threadsnconcurrency.threads;

/**
 * Two ways to create threads in Java
 * 1. by extending the Thread class
 * 2. by implementing the Runnable interface
 */

class Task1 extends Thread {

    @Override
    public void run() { //We need to match the exact signature of Thread class run method
        System.out.println("Task-1 Kicked off");
        for (int i=101; i<199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask-1 done!");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("\nTask-2 Kicked off");
        for (int i=201; i<299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask-2 done!");
    }
}

public class ThreadsDemo {

    public static void main(String[] args) throws InterruptedException {

        /**
         * calling run() is a routine way of invoking a method,
         * it won't make it run in parallel
         */

        //Task-1
        Task1 task1 = new Task1();
        task1.start(); //Yeah, that's right its start() not run() method


        //Task-2
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        //Task-3 Lambda approach
        Runnable runnable = () -> {
            System.out.println("Task-3 Kicked off");
            for (int i=301; i<399; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\nTask-3 done!");
        };

        Thread thread = new Thread(runnable);
        thread.start();

        /**
         * Inter thread communication
         */
        thread.join(); //The next thread will be on hold till this thread completes


        Thread thread2 = new Thread( () -> {
            System.out.println("Task-5 Kicked off");
                for (int i=501; i<599; i++) {
                    System.out.print(i + " ");
                }
            System.out.println("\nTask-5 done!");
        });

        /** Thread Prioritization
         *  @Priority:
         *  1 - Minimum
         *  5 - Normal (default)
         *  10 - High Priority
         *
         *  Priority is just a hint/request to the scheduler & the scheduler may
         *  choose to ignore it (depends on the OS & the platform's JVM implementation)
         *
         */
        thread2.setPriority(10);
        thread2.start();

        //Task-4
        System.out.println("Task-4 Kicked off");
        for (int i=401; i<499; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask-4 done!");

        System.out.println("Main done!");

        Thread sleepyThread = new Thread(() -> {
            System.out.println("\nUnleashing the sleepy Thread");
            try {
                System.out.println("Sleeping...");
                Thread.sleep(8000);
                System.out.println("Wakey! Wakey! -> sleepy Thread ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        sleepyThread.start();

        /** Yielding 'cause the primary purpose of the sleepy thread is to sleep
         *  Therefore, we can request/hint scheduler to allocate the CPU time for other threads
         *
         *  Again, yield is just a hint/request to the scheduler & the scheduler may
         *  choose to ignore it (depends on the OS & the platform's JVM implementation)
         */
        sleepyThread.yield();

    }

}
