package com.interview.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStringsIntoSingleString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Pavan","Pratap","Singh");
        // Using streams to concatenate the list of strings
        String result1 = strings.stream()
                .collect(Collectors.joining(" "));

        System.out.println(result1);
        //
        String result2 = String.join(" ", strings);
        System.out.println(result2);
    }
}
