package edu.sijo.study.java14;

public class Java14InstanceOfFeatures {
    public static void main(String[] args) {
    Object obj = "hello world";
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.contains("hello"));
            // use s
        }

        if (obj instanceof String s) {
            System.out.println(s.contains("hello"));
        }
    }
}
