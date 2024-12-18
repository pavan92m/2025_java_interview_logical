package com.interview.java8.stream_map;

import java.util.Map;
import java.util.stream.Collectors;

public class ConvertStringToMap1 {
    public static void main(String[] args) {
        String str = "ConvertStringToMap";
        Map<Character, Long> charFrequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(charFrequencyMap);
    }
}
