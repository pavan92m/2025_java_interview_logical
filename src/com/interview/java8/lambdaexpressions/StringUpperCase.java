package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
public class StringUpperCase {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hyderabad","Mainpuri","Goa");
        List<String> stringListUpperCase = stringList.stream().map(city->city.toUpperCase()).toList();
        System.out.println(stringList);
        System.out.println(stringListUpperCase);
    }
}
