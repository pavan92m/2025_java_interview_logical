package com.interview.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(222,4,80,1,1,5,4,3,5,9,55,9);
        List<Integer> sortedList = numberList.stream().sorted().toList();
        System.out.println(sortedList);
        List<Integer> comapreSortedList = numberList.stream().sorted(Comparator.comparingInt(Integer::intValue)).toList();
        System.out.println(comapreSortedList);
    }
}
