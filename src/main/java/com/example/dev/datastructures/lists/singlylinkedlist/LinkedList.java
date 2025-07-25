package com.example.dev.datastructures.lists.singlylinkedlist;

public class LinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int length;

    public LinkedList(E value) {
        // Constructor for LinkedList
        Node<E> newNode = new Node<>(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node<E> getHead() {
        System.out.println("Head Node: " + head);
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getTail() {
        System.out.println("Tail Node: " + tail);
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public int getLength() {
        System.out.println("Length of LinkedList: " + length);
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void append(E value) {
        Node<E> newNode = new Node<>(value);
        if(length == 0) { // can also use head is null && tail is null
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        length++;
    }

    public Node<E> removeLast() {
        if (length == 0) {
            return null;
        } else {
            Node<E> temp = head;
            Node<E> prev = head;

            while (temp.getNext() != null) {
                prev = temp;
                temp = temp.getNext();
            }
            tail = prev;
            tail.setNext(null);
            length--;
            // edge case when there is only 1 Node
            if (length == 0) {
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    public void prepend(E value) {
        Node<E> newNode = new Node<>(value);
        if(length == 0) { // can also use if head == null
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        length++;
    }

    public Node<E> removeFirst() {
        if (length == 0) {
            return null;
        }

        Node<E> temp = head;
        head = head.getNext(); // this will be null for single element scenario
        temp.setNext(null);
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node<E> get(int index) {
        if (index < 0 || index >= length) { // Base condition
            return null;
        }

        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public boolean set(int index, E value) {
        Node<E> tempNode = get(index); // this will handle the base condition
        if (tempNode != null) {
            tempNode.setData(value);
            return true; // Successfully set the value
        }
        return false;
    }

    public boolean insert(int index, E value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node<E> newNode = new Node<>(value);
        Node<E> previousNode = get(index - 1);
        newNode.setNext(previousNode.getNext());
        previousNode.setNext(newNode);
        length++;
        return true;
    }

    public Node<E> remove(int index) {
        if (index < 0 || index > length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == length-1) {
            return removeLast();
        }

        Node<E> previousNode = get(index - 1);
        Node<E> tempNode = previousNode.getNext(); // This give the current index Node
        previousNode.setNext(tempNode.getNext());
        tempNode.setNext(null);
        length--;
        return tempNode;
    }

    public void reverse() {
        Node<E> temp = head;
        head = tail;
        tail = temp;
        Node<E> before = null;
        Node<E> after = null;

        for (int i = 0; i < length; i++) {
            after = temp.getNext();
            temp.setNext(before);
            before = temp;
            temp = after;
        }
    }

    public void printList() {
        // Print the linked list
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    public void displayCurrentState() {
        // Display the current state of the linked list
        this.getHead();
        this.getTail();
        this.getLength();
        this.printList();
    }

     public static class Node<E> {

        private E data;
        private Node<E> next;

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node() {
            //(default) no argument constructor
        }

        public Node(E value) {
            this.data = value;
        }

        @Override
        public String toString() {
            return "[Data value: " + data + ", Next value: " + next + "] ";
        }

    }
}
