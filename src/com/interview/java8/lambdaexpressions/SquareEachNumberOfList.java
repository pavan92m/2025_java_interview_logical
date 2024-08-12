package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class SquareEachNumberOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 6, 7, 8, 9, 10, 12, 15, 13, 9);
        List<Integer> squareList = list.stream().map(x->x*x).toList();
        System.out.println(squareList);

    }
}
