package com.interview.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListStringsByLength {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Pavan","Pratap","Singh","Chauhan");
        Map<Integer, List<String>> nameByLengthList = nameList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(nameByLengthList);
    }
}
