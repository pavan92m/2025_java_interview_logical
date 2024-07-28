package com.interview.java8.allmixup;

import java.util.*;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,7,8,3,2,1,5);
        Set<Integer> duplicate =  new HashSet<>();
        //print duplicate numbers
        numbers.stream().filter(n->Collections.frequency(numbers,n)>1).distinct().toList().forEach(System.out::println);
        //print duplicate numbers
        List<Integer> newList = numbers.stream().filter(n->!duplicate.add(n)).toList();
        System.out.println(newList);
    }
}
