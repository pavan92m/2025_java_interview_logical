package com.interview.java8.generalfeatures;

@FunctionalInterface
public interface PersonFactory {
        Person create(String name, Integer age);
}
