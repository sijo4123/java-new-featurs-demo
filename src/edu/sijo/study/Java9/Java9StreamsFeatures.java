package edu.sijo.study.Java9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java9StreamsFeatures {
    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", s -> s + "s")
                .takeWhile(s -> s.length() < 10);
        stream.forEach(System.out::println);
    }
}
