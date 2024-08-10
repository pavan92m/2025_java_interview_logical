package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringBasedOnLength {
    public static void main(String[] args) {
        List<String> foodsList = Arrays.asList("apple", "banana", "cherry", "Milk");
        List<String> sortedFoodList = foodsList.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(sortedFoodList);
        List<String> sortedFoodList2 = foodsList.stream().sorted((o1, o2) -> {
            if(o1.length()>o2.length())
                return 1;
            else if (o1.length()<o2.length()) {
                return -1;
            }
            return 0;
        }).toList();
        System.out.println(sortedFoodList2);
    }
}
