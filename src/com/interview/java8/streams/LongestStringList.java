package com.interview.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry","pineapple");
        List<String> sortedSting = strings.stream().sorted(Comparator.comparing(String::length).reversed()).toList();
        System.out.println(sortedSting);
    }
}
