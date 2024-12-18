package com.interview.java8.stream_map;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertStringToMap2 {
    public static void main(String[] args) {
        String str = "ConvertStringToMap";
        Map<Integer, Character> charFrequencyMap = IntStream.range(0,str.length()).boxed().collect(Collectors.toMap(m->m,str::charAt));
        System.out.println(charFrequencyMap);
    }
}
