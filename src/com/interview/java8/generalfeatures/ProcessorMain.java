package com.interview.java8.generalfeatures;

public class ProcessorMain {
    public static void main(String[] args) {
        // Using a lambda expression to define the process method
        StringProcessor toUpperCaseProcessor = (String input) -> input.toUpperCase();

        // Test the lambda expression
        String result = toUpperCaseProcessor.process("hello world");
        System.out.println(result);  // Output: HELLO WORLD
    }
}
