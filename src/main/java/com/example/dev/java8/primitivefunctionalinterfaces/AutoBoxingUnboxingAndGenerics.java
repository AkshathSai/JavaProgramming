package com.example.dev.java8.primitivefunctionalinterfaces;

public class AutoBoxingUnboxingAndGenerics {

    public static void main(String[] args) {

        /** Automatic conversion of primitive type to Wrapper object
         * is called as AutoBoxing.
         *
         * @Available since Java 1.5V
         *
         * @Under the hood:
         * Integer I = Integer.valueOf(10);
         **/
        Integer I = 10; //Automatic conversion of int value to Integer Wrapper object
        System.out.println(I);


        /** Automatic conversion of Wrapper object to primitive type
         * is called as AutoUnboxing.
         *
         * @Available since Java 1.5V
         *
         * @Under the hood:
         * Integer I = new Integer(10);
         * int x = I.intValue();
         **/
        Integer I1 = new Integer(10);
        int x = I1;

        System.out.println(I1);

    }

}
