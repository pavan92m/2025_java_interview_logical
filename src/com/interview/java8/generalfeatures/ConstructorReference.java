package com.interview.java8.generalfeatures;

public class ConstructorReference {
    public static void main(String[] args) {
        // Using a constructor reference to create a new Person
        PersonFactory personFactory = Person::new;

        // Test the constructor reference
        Person person = personFactory.create("John Doe");
        System.out.println(person);  // Output: Person{name='John Doe'}
    }
}
