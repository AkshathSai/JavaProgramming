package com.example.dev.java8.supplier;

import java.util.function.Supplier;

public class RandomOTPGenerator {

    public static void main(String[] args) {

        //Program to generate a 6 digit otp number
        Supplier<String> otpSupplier = () -> {

            String otp = "";
            //i<6 since 6 digit otp
            for(int i=1; i<6; i++) {
                otp = otp + (int)(Math.random()*10);//Generates a random digit between 0 to 9
            }

            return otp;
        };

        System.out.println(otpSupplier.get());
        System.out.println(otpSupplier.get());
        System.out.println(otpSupplier.get());
        System.out.println(otpSupplier.get());
        System.out.println(otpSupplier.get());
        System.out.println(otpSupplier.get());

    }

}
