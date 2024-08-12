package com.interview.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringsAlphabetically {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");

        List<String> sortedStrings = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedStrings);
    }
}
