package com.interview.java8.optional;

import java.util.Optional;

public class OptionalStrings {
    public static Optional<String> getOptionalString(String input) {
        // Return an Optional containing the input string if it is not null, otherwise return an empty Optional
        return Optional.ofNullable(input);
    }

    public static void main(String[] args) {
        String value = null;

        // Using the method to handle the possible null value
        Optional<String> optionalValue = getOptionalString(value);

        System.out.println(optionalValue); // Output: Optional.empty

        // Example of handling the Optional value
        String result = optionalValue.orElse("Default Value");

        System.out.println(result); // Output: Default Value
    }
}
