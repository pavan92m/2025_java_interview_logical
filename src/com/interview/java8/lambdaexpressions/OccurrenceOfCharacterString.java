package com.interview.java8.lambdaexpressions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfCharacterString {
    public static void main(String[] args) {
        String name = "Pavan Pratap Singh";
        Map<Character, Long> frequencyMap = name.toLowerCase().chars().mapToObj(c->(char)c).filter(Character::isAlphabetic)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequencyMap);
    }
}
