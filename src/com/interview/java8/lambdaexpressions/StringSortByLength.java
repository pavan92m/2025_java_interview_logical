package com.interview.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortByLength {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hyderbad","Mainpuri","Goa","chauhan");
        List<String> sortedStringList = stringList.stream().sorted((str1, str2) -> str1.length() - str2.length()).toList();
        System.out.println(stringList);
        System.out.println(sortedStringList);
        List<String> citiesList = Arrays.asList("Agra","Mainpuri","Kanpur","Goa","Farukhabad");
        System.out.println(citiesList);
        Collections.sort(citiesList, Comparator.comparingInt(String::length));
        System.out.println(citiesList);
    }
}
