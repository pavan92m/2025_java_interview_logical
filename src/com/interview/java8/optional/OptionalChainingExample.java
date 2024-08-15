package com.interview.java8.optional;

import java.util.Optional;

public class OptionalChainingExample {

    public static void main(String[] args) {
        String possibleNullValue = getValue(null); // This could return null


        String result = performOperation(possibleNullValue);
        System.out.println(result);

        String possibleValue = getValue("NotNull"); // This could return not null

        String result1 = getValue(possibleValue); // This could return null                      // Step 5: Provide a default value if the Optional is empty

        System.out.println(result1);
    }

    private static String performOperation(String possiblelValue) {
        return  Optional.ofNullable(possiblelValue) // Step 1: Wrap the nullable value in an Optional
                .map(String::trim)                                // Step 2: Trim the string if it's present
                .filter(s -> !s.isEmpty())                        // Step 3: Filter out empty strings
                .map(s -> "Processed: " + s)                      // Step 4: Apply some processing (e.g., prepend a message)
                .orElse("Default Value");                         // Step 5: Provide a default value if the Optional is empty

    }

    private static String getValue(String operation) {
        if (operation == null)
            return null;
        else
            return "  Hello, World!  ";
    }
}

