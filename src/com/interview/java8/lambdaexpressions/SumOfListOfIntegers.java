package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class SumOfListOfIntegers {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2,4,8,1,3,5,50,55,100);
        Integer sumOfIntegers = numberList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumOfIntegers);
    }
}
