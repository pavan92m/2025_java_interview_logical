package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class ConcatenateStringsWithDelimiter {
    public static void main(String[] args) {
        String delimiter = "'s";
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<String> stringsList = strings.stream().map(s -> s.concat(delimiter)).toList();
        System.out.println(stringsList);
    }
}
