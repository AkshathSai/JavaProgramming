package com.example.dev.java8.supplier;

import java.util.function.Supplier;

public class RandomPasswordGenerator {

    /** Rules:
     *  1. Length should be 8 characters
     *  2. 2, 4, 6, 8 places only digits
     *  3. 1, 3, 5, 7 places only upper case alphabet symbols
     *  4. @ # $ symbols are allowed
     */
    public static void main(String[] args) {

        Supplier<String> passwordSupplier = () -> {

            String pwd = "";

            Supplier<Integer> digitSupplier = () -> (int)(Math.random()*10);

            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ$@#"; //26 Alphabets 3 symbols

            Supplier<Character> characterSupplier = () -> symbols.charAt((int)(Math.random()*29));

            for (int i=1; i<=8; i ++) {
                //Keeping digits at even places 2, 4, 6, 8
                if(i%2==0) {
                    pwd = pwd + digitSupplier.get();
                } else {
                    //Odd places characters will be placed
                    pwd = pwd + characterSupplier.get();
                }
            }

            return pwd;
        };

        System.out.println(passwordSupplier.get());
        System.out.println(passwordSupplier.get());
        System.out.println(passwordSupplier.get());

    }

}
