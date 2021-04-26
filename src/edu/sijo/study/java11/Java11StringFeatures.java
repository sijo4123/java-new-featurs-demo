package edu.sijo.study.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Java11StringFeatures {
    public static void main(String[] args) throws IOException {
        System.out.println("Marco".isBlank());
        System.out.println("Mar\nco".lines());
        System.out.println("Marco  ".strip());

        Path path = Files.writeString(Files.createTempFile("helloworld", ".txt"), "Hi, my name is!");
        String s = Files.readString(path);
    }
}
