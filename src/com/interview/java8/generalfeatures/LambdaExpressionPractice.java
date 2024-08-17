package com.interview.java8.generalfeatures;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionPractice {
    public static void main(String[] args) {
        // Creating a list of strings
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        // Using a lambda expression to iterate over the list and print each element
        items.forEach(item -> System.out.println(item));
    }
}
