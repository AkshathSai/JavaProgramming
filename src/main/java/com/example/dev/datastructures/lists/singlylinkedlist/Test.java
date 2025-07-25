package com.example.dev.datastructures.lists.singlylinkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(2);
        linkedList.displayCurrentState();
        linkedList.append(3);
        linkedList.displayCurrentState();
        linkedList.append(4);
        linkedList.displayCurrentState();
        log.info("Removed element: {}", linkedList.removeLast());
        linkedList.displayCurrentState();

        System.out.println("====     Another scenario     ====");
        LinkedList<Integer> linkedList2 = new LinkedList<>(1);
        linkedList2.append(2);
        linkedList2.displayCurrentState();
        log.info("Removed element: {}", linkedList2.removeLast());
        linkedList2.displayCurrentState();
        log.info("Removed element: {}", linkedList2.removeLast());
        linkedList2.displayCurrentState();
        // (0) elements
        log.info("Removed element: {}", linkedList2.removeLast());

        linkedList.displayCurrentState();
        linkedList.prepend(1);
        linkedList.displayCurrentState();
        log.info("Removed element: {}", linkedList.removeFirst());
        linkedList.displayCurrentState();

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.get(-1));

        log.info("=== SET ===");
        linkedList.displayCurrentState();
        System.out.println(linkedList.set(1,1));
        linkedList.displayCurrentState();
        System.out.println(linkedList.set(0,1));
        linkedList.displayCurrentState();

        log.info("=== INSERT ===");
        linkedList.insert(0, 0);
        linkedList.displayCurrentState();
        linkedList.insert(2, 2);
        linkedList.insert(4,3);
        linkedList.displayCurrentState();

        log.info("=== REMOVE ===");
        linkedList.remove(0);
        linkedList.displayCurrentState();
        linkedList.remove(2);
        linkedList.displayCurrentState();

        log.info("=== REVERSE ===");
        linkedList.reverse();
        linkedList.displayCurrentState();
    }
}
