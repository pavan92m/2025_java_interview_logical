package com.interview.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StringsToUppercase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<String> stringsUpperCase = strings.stream().map(String::toUpperCase).toList();
        System.out.println(stringsUpperCase);
    }
}
