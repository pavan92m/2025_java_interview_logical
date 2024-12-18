package com.interview.java8.stream_list;

import java.util.List;

public class ConvertStringToList {
    public static void main(String[] args) {
        String str = "ConvertStringToMap";
        List<Character> characterList = str.chars().mapToObj(c -> (char) c).toList();
        System.out.println(characterList);
    }
}
