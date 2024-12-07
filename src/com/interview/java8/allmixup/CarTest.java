package com.interview.java8.allmixup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarTest {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Toyota"),
                new Car("Honda"),
                new Car("Ford")
        );
        List<String> models = cars.stream()
                .map(car -> car.getModel())
                .collect(Collectors.toList());

        System.out.println(models);
    }

}
