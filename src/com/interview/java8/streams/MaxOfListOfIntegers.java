package com.interview.java8.streams;

import java.util.Arrays;
import java.util.List;

public class MaxOfListOfIntegers {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2,4,8,105,3,5,50,55,100);
        Integer maxOfIntegers = numberList.stream().max(Integer::compareTo).get();
        System.out.println(maxOfIntegers);
    }
}
