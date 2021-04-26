package edu.sijo.study.Java8;

public class Java8RuunableFeatures {
    public static void main(String[] args) {
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("Hello world !");
            }
        };

        Runnable runnableLambda = () -> System.out.println("Hello world two!");
    }
}
