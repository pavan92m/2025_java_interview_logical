package com.interview.java8.generalfeatures;

public class BajajBike implements Bike{
    @Override
    public void bikeCompany() {
        System.out.println("This is the Bajaj bike.");
    }
    @Override
    public void defaultBikeFunction() {
        System.out.println("This is the overridden implementation of the default method in BajajBike.");
    }
}
