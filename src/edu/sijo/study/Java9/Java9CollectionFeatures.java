package edu.sijo.study.Java9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java9CollectionFeatures {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three");
        System.out.println(list);
        Set<String> set = Set.of("one", "two", "three");
        System.out.println(set);
        Map<String, String> map = Map.of("foo", "one", "bar", "two");
        System.out.println(map);
    }
}
