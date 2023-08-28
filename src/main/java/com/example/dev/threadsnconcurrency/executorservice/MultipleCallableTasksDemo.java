package com.example.dev.threadsnconcurrency.executorservice;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableTasksDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        List<Callable<String>> tasks = List.of(new CallableTask("Task-1"),
                new CallableTask("Task-2"),
                new CallableTask("Task-3"),
                new CallableTask("Task-4"));

        var executorService = Executors.newFixedThreadPool(3);

        List<Future<String>> futures = executorService.invokeAll(tasks);

        for (var future: futures) {
            System.out.println(future.get());
        }

        executorService.shutdown();

    }
}
