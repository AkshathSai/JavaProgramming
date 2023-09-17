package com.example.dev.collections.queue;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String object1, String object2) {
        //return Integer.compare(object1.length(), object2.length());
        return Integer.compare(object2.length(), object1.length()); //Desc order
    }
}

@Slf4j
public class QueueExample {

    public static void main(String[] args) {

        /**
         * Priority Queue sorts all the input elements in natural order sorting
         */
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        queue.offer("Cat");
        queue.add("Monkey");
        queue.addAll(List.of("Zebra", "Tiger"));

        LOGGER.info("{}", queue);

        //Gets the element from the queue
        LOGGER.info(queue.poll());

    }
}
