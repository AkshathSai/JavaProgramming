package com.example.dev.threadsnconcurrency.executorservice;

import java.util.concurrent.*;


/**
 * Callable is used for executing Tasks that returns a value back
 */
class CallableTask implements Callable<String> {

    private String taskName;

    public CallableTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Hello from " + taskName;
    }
}

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        /**
         * Future is a result but not really a method,
         * it's a promise that we'll have a result at a later point of time
         */
        Future<String> hellofuture = executorService.submit(new CallableTask("Task-1"));
        System.out.println("new CallableTask executed");

        /**
         * When you call get(), it will wait for the task execution to finish.
         * Only once it is finished it'll proceed to the next line.
         */
        String sayHello = hellofuture.get();

        System.out.println(sayHello);

        executorService.shutdown();

        System.out.println("Main completed");
    }
}
