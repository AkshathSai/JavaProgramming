package com.example.dev.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class ScanCurrentDirectory {

    public static void main(String[] args) throws IOException {

        /**
         * "." here refers to current directory
         */
        Path currentDirectory = Paths.get(".");

        //List files & folders in the current directory with Files.list
        Files.list(currentDirectory).forEach(System.out::println);

        //Searches the entire directory including the files & folders underneath them
        Files.walk(currentDirectory, 3).forEach(System.out::println);

        //Prints only .java files
        Files.walk(currentDirectory, 8)
                .filter(path -> String.valueOf(path).contains(".java"))
                .forEach(System.out::println);

        BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();
        BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> String.valueOf(path).contains(".java");

        Files.find(currentDirectory, 8, directoryMatcher).forEach(System.out::println);
        Files.find(currentDirectory, 8, javaMatcher).forEach(System.out::println);
    }
}
