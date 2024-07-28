package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2,4,8,1,3,5,50,55,100);
        List<Integer> evenNumberList = numberList.stream().filter(num->num%2==0).toList();
        System.out.println(numberList);
        System.out.println(evenNumberList);
    }
}
