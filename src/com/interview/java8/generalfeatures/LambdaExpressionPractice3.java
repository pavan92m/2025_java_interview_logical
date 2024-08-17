package com.interview.java8.generalfeatures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionPractice3 {
    public static void main(String[] args) {
        // Creating a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        // Using a lambda expression to create a Comparator for sorting by age
        Comparator<Person> ageComparator = (Person p1, Person p2) -> Integer.compare(p1.getAge(), p2.getAge());

        // Sorting the list using the Comparator
        people.sort(ageComparator);

        // Printing the sorted list
        people.forEach(System.out::println);
    }
}
