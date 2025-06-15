package com.example.dev.collections.fun;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.Iterator;

@Slf4j
public class ArrayDequeTest {
    /**
     * This class demonstrates the usage of ArrayDeque in Java.
     * It shows how to add elements to the deque and iterate through them in reverse order.
     * ArrayDeque is faster than Stack and Queue and can be used as a replacement for stack or queue.
     */
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        // Adding elements to the deque
        deque.add("Element 2");
        deque.add("Element 1");
        deque.add("Element 3");
        log.info("Deque after adding elements: {}", deque);
        log.info(deque.getFirst());
        log.info(deque.poll());
        log.info(deque.getLast());
        log.info(deque.peek());
        for (Iterator<String> it = deque.descendingIterator(); it.hasNext(); ) {
            String s = it.next();
            log.info("Deque descending iterator: {}", s);
        }
        for(String s: deque) {
            log.info("Deque iterator: {}", s);
        }
    }

}
