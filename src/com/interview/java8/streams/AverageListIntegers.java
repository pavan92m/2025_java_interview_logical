package com.interview.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageListIntegers {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2,4,8,1,1,5,4,3,5,9,55,9);
        Double averageValue = numberList.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(averageValue);
        int[] numbers = {2, 4, 8, 1, 1, 5, 4, 3, 5, 9, 55, 9};
        double average = Arrays.stream(numbers)
                .average()
                .orElse(Double.NaN);
        System.out.println(average);
    }
}
