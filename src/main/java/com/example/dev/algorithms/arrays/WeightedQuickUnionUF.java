package com.example.dev.algorithms.arrays;

import lombok.ToString;

import java.time.Instant;

@ToString
public class WeightedQuickUnionUF {
    private int[] parent;   // parent[i] = parent of i
    private int[] size;     // size[i] = number of elements in subtree rooted at i
    private int count;      // number of components

    /**
     * Initializes an empty union-find data structure with
     * {@code n} elements {@code 0} through {@code n-1}.
     * Initially, each element is in its own set.
     *
     * @param  n the number of elements
     * @throws IllegalArgumentException if {@code n < 0}
     */
    public WeightedQuickUnionUF(int n) {
        count = n;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    /**
     * Returns the number of sets.
     *
     * @return the number of sets (between {@code 1} and {@code n})
     */
    public int count() {
        return count;
    }

    /**
     * Returns the canonical element of the set containing element {@code p}.
     *
     * @param  p an element
     * @return the canonical element of the set containing {@code p}
     * @throws IllegalArgumentException unless {@code 0 <= p < n}
     */
    public int find(int p) {
        validate(p);
        while (p != parent[p]) {
            parent[p] = parent[parent[p]]; // Path compression: make element point to its grandparent
            p = parent[p];
        }
        return p;
    }

    /**
     * Returns true if the two elements are in the same set.
     *
     * @param  p one element
     * @param  q the other element
     * @return {@code true} if {@code p} and {@code q} are in the same set;
     *         {@code false} otherwise
     * @throws IllegalArgumentException unless
     *         both {@code 0 <= p < n} and {@code 0 <= q < n}
     * @deprecated Replace with two calls to {@link #find(int)}.
     */
    @Deprecated
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    // validate that p is a valid index
    private void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }

    /**
     * Merges the set containing element {@code p} with the set
     * containing element {@code q}.
     *
     * @param  p one element
     * @param  q the other element
     * @throws IllegalArgumentException unless
     *         both {@code 0 <= p < n} and {@code 0 <= q < n}
     */
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;

        // make smaller root point to larger one
        if (size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        count--;
    }


    /**
     * Reads an integer {@code n} and a sequence of pairs of integers
     * (between {@code 0} and {@code n-1}) from standard input, where each integer
     * in the pair represents some element;
     * if the elements are in different sets, merge the two sets
     * and print the pair to standard output.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Instant start = Instant.now();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(10);
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
        Instant end = Instant.now();
        System.out.println("Time taken: " + (end.toEpochMilli() - start.toEpochMilli()) + " ms");
    }

}
