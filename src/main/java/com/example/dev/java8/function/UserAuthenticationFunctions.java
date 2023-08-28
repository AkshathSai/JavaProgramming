package com.example.dev.java8.function;

import java.util.Scanner;
import java.util.function.Function;

public class UserAuthenticationFunctions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your UserName:");
        String userName = sc.next();
        System.out.println("Enter your password:");
        String password = sc.next();

        //Considering only first 5 characters of UserName
        Function<String, String> f1 = s -> s.substring(0, 5);

        //Enforcing lowercase check on password
        Function<String, String> f2 = s -> s.toLowerCase();

        if(f1.andThen(f2).apply(userName).equals("aksha") && password.equals("java")) {
            System.out.println("Valid User");
        } else {
            System.out.println("Invalid User");
        }

    }
}
