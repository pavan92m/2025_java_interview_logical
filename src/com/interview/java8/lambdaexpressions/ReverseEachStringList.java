package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class ReverseEachStringList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<String> reversedStrings = strings.stream()
                .map(s -> new StringBuilder(s).reverse().toString())
                .toList();
        System.out.println(strings);
        System.out.println(reversedStrings);
    }
}
