package com.interview.java8.generalfeatures;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaExpressionPractice4 {
    public static void main(String[] args) {
        // Creating a map of string keys to integer values
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        map.put("date", 4);
        map.put("elderberry", 5);

        // Filtering the map to include only keys that start with the letter 'b'
        Map<String, Integer> filteredMap = map.entrySet().stream()
                .filter(entry -> entry.getKey().startsWith("b"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Printing the filtered map
        filteredMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
