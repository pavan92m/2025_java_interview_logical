package com.interview.java8.allmixup;

import java.util.*;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,34,56,23,4,56,34,44,55,43,55);
        List<Integer> numbersNew = numbers.stream().sorted().distinct().toList();
        System.out.println(numbersNew);
        int secondLargestIndex = numbersNew.size()-2;
        System.out.println(numbersNew.get(secondLargestIndex));
    }
}
