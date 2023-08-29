package com.example.dev.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
    }
}
