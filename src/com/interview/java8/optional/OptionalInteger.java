package com.interview.java8.optional;

import java.util.Optional;

public class OptionalInteger {
    public static Optional<Integer> getOptionalInteger(Integer input) {
        // Return an Optional containing the input string if it is not null, otherwise return an empty Optional
        return Optional.ofNullable(input);
    }

    public static void main(String[] args) {
        Integer value = null;

        // Using the method to handle the possible null value
        Optional<Integer> optionalValue = getOptionalInteger(value);
        
        System.out.println(optionalValue); // Output: Optional.empty

        // Example of handling the Optional value
        Integer result = optionalValue.orElse(0);

        System.out.println(result); // Output: Default Value
       optionalValue.orElseThrow();
    }
}
