package edu.sijo.study.Java8;

import java.util.Arrays;
import java.util.List;

public class Java8StreamsFeatures {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");
        System.out.println(list);

        list.stream()
                .filter(name -> name.startsWith("f"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
