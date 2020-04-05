package com.michaelhefner;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Path file = FileSystems.getDefault().getPath("src/com/michaelhefner/file.txt");
        List<String> lines = null;
        try {
            lines = Files.readAllLines(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line :
                lines) {
            System.out.println(line);
        }
    }
}
