package com.example.dev.datastructures.lists.singlylinkedlist;

public class Node<E> {

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

    @Override
    public String toString() {
        return "[Data value: " + data + ", Next value: " + next + "] ";
    }

}
