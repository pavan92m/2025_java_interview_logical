package com.interview.questionsolution;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapBasedOnValue1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Pavan");
        map.put(2, "Pratap");
        map.put(3, "Singh");
        map.put(4, "Chauhan");

        Map<Integer, String> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        // Print the sorted map
        System.out.println("Sorted Map: " + sortedMap);
    }
}

