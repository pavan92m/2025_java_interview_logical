package com.interview.java8.generalfeatures;

public interface Bike {
    default void defaultBikeFunction() {
        System.out.println("This is the default implementation of the method.");
    }

    // Abstract method (not required, but common in interfaces)
    void bikeCompany();
    static void wheels(){
        System.out.println("Every Bike have two wheels");
    }
}
