package edu.sijo.study.java10;

public class Java10LocalVariableTypeInference {
    public static void main(String[] args) {
        // Pre-Java 10
        String myName = "Marco";
        System.out.println(myName);

        // With Java 10
        var varMyName = "Marco";
        System.out.println(varMyName);
    }
}
