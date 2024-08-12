package com.interview.java8.streams;

import java.util.Arrays;
import java.util.List;

public class CountNumberOfDistinctElements {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2,4,8,1,1,5,4,3,5,9,55,9);
        int countNumbers = numberList.stream().distinct().toList().size();
        System.out.println(countNumbers);
    }
}
