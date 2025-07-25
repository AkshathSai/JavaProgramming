package com.example.dev.datastructures.lists.doublylinkedlist;

public class DoublyLinkedList<E> {

    Node<E> head;
    Node<E> tail;
    int length;

    public DoublyLinkedList(E data) {
        Node<E> newNode = new Node<>(data);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static class Node<E> {
        E value;
        Node<E> next;
        Node<E> prev;

        Node(E value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

}
