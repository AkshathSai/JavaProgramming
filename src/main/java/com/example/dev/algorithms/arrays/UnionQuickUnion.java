package com.example.dev.algorithms.arrays;

import lombok.ToString;

/**
 * UnionQuickFind is an implementation of the Quick Find algorithm for union-find data structure.
 * It allows for efficient union and find operations on a set of elements.
 * The time complexity for union is O(N) and for connected (find) is O(N).
 * This implementation uses an array to keep track of the connected components.
 * <p>
 * While Quick-union is a more efficient algorithm than quick-find for union-find operations
 * it suffers from tall trees which can lead to inefficient operations.
 */
@ToString
public class UnionQuickUnion {

    // Data structure to hold the ids of elements
    private final int[] id;

    // initialize: O(N)
    public UnionQuickUnion(int N) {
        id = new int[N];
        // Initialize each element's id to its own index
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // root: O(N)
    public int root(int i) {
        // Find the root of the element p
        while (id[i] != i) {
            i = id[i]; // Traverse to the root
        }
        return i;
    }

    // connected or also called find: O(N)
    public boolean connected(int p, int q) {
        // Check if two elements are connected
        return root(p) == root(q);
    }

    // O(N)
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j; // Connect the root of p to the root of q
    }

    public static void main(String[] args) {
        // Example usage of UnionFind
        UnionQuickUnion uf = new UnionQuickUnion(10);
        System.out.println("Array Right now: " + uf);
        System.out.println("Are 4 and 3 connected? " + uf.connected(4, 3));
        uf.union(4, 3);
        System.out.println("Are 4 and 3 connected after union? " + uf.connected(4, 3));
        System.out.println(uf);
        System.out.println("Are 3 and 8 connected? " + uf.connected(3, 8));
        uf.union(3, 8);
        System.out.println("Are 3 and 8 connected after union? " + uf.connected(3, 8));
        System.out.println(uf);
        System.out.println("Are 9 and 4 connected? " + uf.connected(9, 4));
        uf.union(9, 4);
        System.out.println("Are 9 and 4 connected after union? " + uf.connected(9, 4));
        System.out.println("Are 8 and 9 connected after union? " + uf.connected(8, 9));
        System.out.println(uf);
    }
}
