package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringInList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        Optional<String> maxLengthString = strings.stream().max(Comparator.comparing(String::length));
        maxLengthString.ifPresent(System.out::println);
    }
}
