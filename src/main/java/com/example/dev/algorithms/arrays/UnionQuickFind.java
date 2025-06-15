package com.example.dev.algorithms.arrays;

import lombok.ToString;

/**
 * UnionQuickFind is an implementation of the Quick Find algorithm for union-find data structure.
 * It allows for efficient union and find operations on a set of elements.
 * The time complexity for union is O(N) and for connected (find) is O(1).
 * This implementation uses an array to keep track of the connected components.
 * <p>
 * Quick-find is too slow!
 */
@ToString
public class UnionQuickFind {

    // Data structure to hold the ids of elements
    private final int[] id;

    // initialize: O(N)
    public UnionQuickFind(int N) {
        id = new int[N];
        // Initialize each element's id to its own index
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // connected or also called find: O(1)
    public boolean connected(int p, int q) {
        // Check if two elements are connected
        return id[p] == id[q];
    }

    // union: O(N)
    public void union(int p, int q) {
        // Connect two elements using the first element's id
        int pId = id[p];
        int qId = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = qId; // Change all ids that match pId to qId
            }
        }
    }

    public static void main(String[] args) {
        // Example usage of UnionFind
        UnionQuickFind uf = new UnionQuickFind(10);
        System.out.println("Array Right now: " + uf);
        System.out.println("Are 1 and 2 connected? " + uf.connected(1, 2));
        uf.union(1, 2);
        System.out.println("Are 1 and 2 connected after union? " + uf.connected(1, 2));
        System.out.println(uf);
        System.out.println("Are 2 and 5 connected? " + uf.connected(2, 5));
        uf.union(2,5);
        System.out.println("Are 2 and 5 connected after union? " + uf.connected(2, 5));
        System.out.println(uf);
        System.out.println("Are 0 and 5 connected?" + uf.connected(0, 5));
        uf.union(0,5);
        System.out.println("Are 0 and 5 connected after union? " + uf.connected(0, 5));
        System.out.println(uf);
    }
}
