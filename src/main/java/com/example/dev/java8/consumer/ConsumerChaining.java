package com.example.dev.java8.consumer;

import java.util.function.Consumer;

public class ConsumerChaining {

    public static void main(String[] args) {

        /**
         * Consumer Functional Interface contains only 2 method
         * accept(); (SAM) , andThen() (Default method)
         *
         * andThen() is used for Consumer Chaining
         */

        Consumer<MovieDetails> c1 = m -> {
          System.out.println(m.name + " is going to be released");
        };

        Consumer<MovieDetails> c2 = m -> {
          System.out.println(m.name + " is released result " + m.result);
        };

        Consumer<MovieDetails> c3 = m -> {
            System.out.println(m.name + " is being stored in database");
        };

        Consumer<MovieDetails> chainC = c1.andThen(c2).andThen(c3);

        MovieDetails m1 = new MovieDetails("Bahubali", "Hit");
        chainC.accept(m1);

        MovieDetails m2 = new MovieDetails("Spyder", "Flop");
        chainC.accept(m2);

    }

}
