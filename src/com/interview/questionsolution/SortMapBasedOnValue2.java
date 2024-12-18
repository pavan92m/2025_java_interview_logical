package com.interview.questionsolution;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortMapBasedOnValue2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Pratap");
        map.put(3, "Singh");
        map.put(4, "Chauhan");
        map.put(1, "Pavan");

        // Transform and sort map by values
        TreeMap<Integer, String> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        TreeMap::new
                ));

        // Print the sorted map
        System.out.println("Sorted Map: " + sortedMap);
    }
}

