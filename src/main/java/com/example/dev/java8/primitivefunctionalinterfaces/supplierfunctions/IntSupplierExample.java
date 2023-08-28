package com.example.dev.java8.primitivefunctionalinterfaces.supplierfunctions;

import java.util.function.IntSupplier;

public class IntSupplierExample {

    public static void main(String[] args) {

        IntSupplier s = () -> (int)(Math.random() * 9);

        String otp="";
        for (int i=0; i<6; i++) {
            otp = otp + s.getAsInt();
        }

        System.out.println(otp);

    }
}
