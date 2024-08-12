package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 6, 7, 8, 9, 10, 12, 15, 13, 9);
        List<Integer> evenNumbersList = list.stream().filter(number -> number % 2 == 0).toList();
        System.out.println(evenNumbersList);
    }
}
