package com.interview.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HandleOptionalEmptyList {

    // Method that returns an Optional<List<String>>
    public static Optional<List<String>> getStringList() {
        List<String> list = new ArrayList<>();
        return list.isEmpty() ? Optional.empty() : Optional.of(list);
    }

    public static void main(String[] args) {
        Optional<List<String>> optionalList = getStringList();
        optionalList.ifPresentOrElse(
                list -> System.out.println("List contents: " + list),
                () -> System.out.println("The list is empty or not present.")
        );
    }
}

