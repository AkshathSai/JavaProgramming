package com.example.dev.math;

public class GCD {

    public static int gcd(int p, int q) {
        if (q==0) {
            return p;
        } else {
            return gcd(q, p%q);
        }
    }

    public static void main(String[] args) {
        int p = 216;
        int q = 192;
        int result = gcd(p, q);
        System.out.println("GCD of " + p + " and " + q + " is: " + result);

    }
}
