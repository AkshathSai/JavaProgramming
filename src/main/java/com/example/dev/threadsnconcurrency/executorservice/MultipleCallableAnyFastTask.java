package com.example.dev.threadsnconcurrency.executorservice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class MultipleCallableAnyFastTask {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        List<CallableTask> taskList = List.of(new CallableTask("Task-1"),
                new CallableTask("Task-2"),
                new CallableTask("Task-3"),
                new CallableTask("Task-4"));

        var executorService = Executors.newFixedThreadPool(3);

        String anyFastResult = executorService.invokeAny(taskList);

        System.out.println(anyFastResult);

        executorService.shutdown();

    }
}
