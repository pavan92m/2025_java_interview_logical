package com.interview.java8.generalfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionPractice2 {
    public static void main(String[] args) {
        // Creating a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        // Using a lambda expression to create a Comparator for sorting by name
        Comparator<Person> nameComparator = (Person p1, Person p2) -> p1.getName().compareTo(p2.getName());

        // Sorting the list using the Comparator
        people.sort(nameComparator);

        // Printing the sorted list
        people.forEach(System.out::println);
    }
}
