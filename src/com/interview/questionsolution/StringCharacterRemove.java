package com.interview.questionsolution;

import java.util.stream.Collectors;

public class StringCharacterRemove {
    public static void main(String[] args) {
        String str = "leet* co*de";
        String newStr = str.chars().filter(c->c!='*').mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());;
        System.out.println(newStr);
    }
}
