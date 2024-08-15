package com.interview.java8.optional;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalMapExample {

    public static Optional<Map<String, Integer>> getMap() {
        Map<String, Integer> map = new HashMap<>();
        return map.isEmpty() ? Optional.empty() : Optional.of(map);
    }

    public static void main(String[] args) {
        Optional<Map<String, Integer>> optionalMap = getMap();
        optionalMap.ifPresentOrElse(
                map -> System.out.println("Map contents: " + map),
                () -> System.out.println("The map is empty or not present.")
        );
        Optional<Integer> value1 = Optional.of(10);
        Optional<Integer> value2 = Optional.of(20);

        Optional<Integer> combinedValue = value1.flatMap(v1 ->
                value2.map(v2 -> v1 + v2)
        );
        combinedValue.ifPresentOrElse(
                result -> System.out.println("Combined value: " + result),
                () -> System.out.println("One or both values are not present.")
        );
    }
}
