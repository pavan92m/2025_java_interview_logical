package com.interview.java8.stream_list;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {
    public static void main(String[] args) {
        String name = "Pavan Pratap Singh";
        Map<Character, Long> map = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

        long countWithoutSpaces = name.chars()
                .filter(c -> !Character.isWhitespace(c))
                .count();

        System.out.println("Character count (excluding spaces): " + countWithoutSpaces);

    }
}
