package com.example.dev.java8.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthenticationPredicate {

    /** Example showing how to use Predicates for User Authentication */
    public static void main(String[] args) {

        String username, password;

        Predicate<User> p = user -> user.getUsername().equals("Akshath") && user.getPassword().equals("java");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Username:");
        username = sc.next();
        System.out.println("Enter your Password:");
        password = sc.next();

        User user = new User(username, password);

        if(p.test(user)) {
            System.out.println("Valid User and can avail all services");
        } else {
            System.out.println("Invalid Username/Password please try again");
        }

    }

}
