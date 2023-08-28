package com.example.dev.threadsnconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static ExecutorService createFixedThreadPool() {
        //System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
        return Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

}