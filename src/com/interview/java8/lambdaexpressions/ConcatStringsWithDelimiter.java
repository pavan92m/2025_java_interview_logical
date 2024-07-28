package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatStringsWithDelimiter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        String delimiter = ",";
        String delimiterString  = strings.stream().collect(Collectors.joining(delimiter));
        System.out.println(delimiterString);
    }
}
