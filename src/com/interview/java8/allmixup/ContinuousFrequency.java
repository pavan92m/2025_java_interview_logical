package com.interview.java8.allmixup;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContinuousFrequency {
    public static void main(String[] args) {
        String input = "waabbbccddaaabbccceeff";

       Map<String, String> valueMap =  IntStream.range(0, input.length())
                .mapToObj(i -> String.valueOf(input.charAt(i)))
                .collect(Collectors.groupingBy(
                        s -> s,
                        Collectors.joining("")
                ));
        System.out.println(valueMap);
        String output = valueMap.values()
                .stream()
                .map(s -> s.charAt(0) + String.valueOf(s.length()))
                .collect(Collectors.joining());

        System.out.println(output);
    }
}
