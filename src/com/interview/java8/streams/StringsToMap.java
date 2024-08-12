package com.interview.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringsToMap {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry", "date");

        Map<String, Integer> stringLengthMap = strings.stream()
                .collect(Collectors.toMap(
                        str -> str,          // Key: the string itself
                        String::length       // Value: the length of the string
                ));

        System.out.println(stringLengthMap);
    }
}
