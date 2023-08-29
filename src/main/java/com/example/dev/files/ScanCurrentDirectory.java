package com.example.dev.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScanCurrentDirectory {

    public static void main(String[] args) throws IOException {

        /**
         * "*" here means current directory
         */

        //List files & folders in the current directory with Files.list
        Files.list(Paths.get(".")).forEach(System.out::println);



    }
}
