package com.interview.java8.generalfeatures;

public interface Car {
    void type();
    default void companyFeature(String companyName){
        System.out.println(companyName + " have new car feature.");
    }
}
