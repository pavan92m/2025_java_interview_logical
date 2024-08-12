package com.interview.java8.streams;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterString {
    public static void main(String[] args) {
        String name = "Pavan Pratap Singh";
        Map<String, Long> characterLongMap = name.chars().mapToObj(s -> (char) s).filter(Character::isAlphabetic)
                .map(s -> s.toString().toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterLongMap);
       Optional<Map.Entry<String, Long>> FirstNonRepeatedCharacterMap = characterLongMap.entrySet().stream().
                filter(e -> e.getValue() == 1).findFirst();
        FirstNonRepeatedCharacterMap.ifPresent(stringLongEntry -> System.out.println(stringLongEntry.getKey()));
    }
}
