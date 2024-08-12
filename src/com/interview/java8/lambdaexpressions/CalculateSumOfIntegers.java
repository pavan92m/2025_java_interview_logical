package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class CalculateSumOfIntegers {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(1,2,3,4,19,15,13,8,9);
       int sum = listInteger.stream().mapToInt(s -> s).sum();
        System.out.println(sum);
    }
}
