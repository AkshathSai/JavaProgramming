package com.example.dev.java8.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerMovieInformationExample {

    public static void main(String[] args) {

        ArrayList<Movie> al = new ArrayList<Movie>();
        populate(al);

        Consumer<Movie> c = m -> {
            System.out.println("Movie name: " + m.name);
            System.out.println("Hero: " + m.hero);
            System.out.println("Heroine: " + m.heroine);
            System.out.println();
        };

        for (Movie m : al) {
            c.accept(m);
        }

    }

    private static void populate(ArrayList<Movie> al) {

        al.add(new Movie("Bahubali", "Prabhas", "Anushka"));
        al.add(new Movie("Eega", "Nani", "Samantha"));
        al.add(new Movie("Interstellar", "Matthew McConaughey", "Anne Hathaway"));
        al.add(new Movie("Forrest Gump", "Tom Hanks", "Robin Wright"));
        al.add(new Movie("Rocketry", "Madhavan", "Misha Ghoshal"));

    }

}
