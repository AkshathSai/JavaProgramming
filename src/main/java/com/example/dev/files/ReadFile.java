package com.example.dev.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        // "." here refers to current directory
        Path filePath = Paths.get("./src/main/resources/data.txt");

        Files.lines(filePath)
                .map(String::toLowerCase)
                .filter(str -> str.contains("a"))
                .forEach(System.out::println);
    }
}
