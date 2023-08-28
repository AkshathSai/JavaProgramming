package com.example.dev.java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        /**
         * Supplier Interface contains a Single Abstract Method
         * get()
         *
         * get() won't take any argument but it will
         * always return something
         *
         * Use case:
         * There is no requirement that a new or distinct result
         * be returned each time the supplier is invoked.
         */
        Supplier<Date> s = () -> new Date();
        System.out.println(s.get());

    }

}
