package com.interview.java8.optional;

import java.util.Optional;

public class OptionalDouble {
    public static Optional<Double> findAndFilterDouble(Double input) {
        // Return an Optional containing the input double if it is not null and greater than 10.0, otherwise return an empty Optional
        return Optional.ofNullable(input).filter(value -> value > 10.0);
    }

    public static void main(String[] args) {
        Double value = 8.5;

        // Using the method to filter the value
        Optional<Double> optionalValue = findAndFilterDouble(value);

        // Example of handling the Optional value
        Double result = optionalValue.orElse(0.0);

        System.out.println(result); // Output: 0.0

        Double value2 = 11.0;
        // Using the method to filter the value
        Optional<Double> optionalValue2 = findAndFilterDouble(value2);

        // Example of handling the Optional value
        Double result2 = optionalValue2.orElse(0.0);

        System.out.println(result2); // Output: 0.0

    }
}
