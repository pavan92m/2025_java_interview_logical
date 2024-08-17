package com.interview.java8.generalfeatures;

public class MethodReference {
    public static void main(String[] args) {
        Animal.eatingBehaviour("Eat");//Write a method reference to a static method.

        StringUtils stringUtils = new StringUtils();

        // Using method reference to an instance method of a particular object
        StringProcessor toUpperCaseProcessor = stringUtils::toUpperCase;

        // Test the method reference
        String result = toUpperCaseProcessor.process("hello world");
        System.out.println(result);  // Output: HELLO WORLD
    }
}
