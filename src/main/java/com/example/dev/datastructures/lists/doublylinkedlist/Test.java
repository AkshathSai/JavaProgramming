package com.example.dev.datastructures.lists.doublylinkedlist;

public class Test {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>(3);
        System.out.println("Head: " + dll.getHead().value);
        System.out.println("Tail: " + dll.getTail().value);
        System.out.println("Length of the list: " + dll.length);
        dll.printList();
    }
}
