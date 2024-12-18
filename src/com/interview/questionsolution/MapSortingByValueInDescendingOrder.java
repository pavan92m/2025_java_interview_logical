package com.interview.questionsolution;
import java.util.*;
import java.util.stream.Collectors;

public class MapSortingByValueInDescendingOrder {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Pavan");
        map.put(2, "Pratap");
        map.put(3, "Singh");
        map.put(4, "Chauhan");

        // Sorting the map by values in descending order
        Map<Integer, String> sortedMapDesc = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByValue().reversed()) // Sort by value in descending order
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, // Handle key collisions
                        LinkedHashMap::new // Maintain insertion order
                ));

        // Print the sorted map
        System.out.println("Sorted Map (Descending Order): " + sortedMapDesc);
    }
}

