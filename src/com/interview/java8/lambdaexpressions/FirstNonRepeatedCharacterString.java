package com.interview.java8.lambdaexpressions;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterString {
    public static void main(String[] args) {
        String name = "Pavan Pratap Singh";
        Map<Character, Long> frequencyMap = name.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequencyMap);
        Optional<Character> charsValues = name.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> frequencyMap.get(c) == 1)
                .findFirst();
        charsValues.ifPresent(System.out::println);
    }
}
