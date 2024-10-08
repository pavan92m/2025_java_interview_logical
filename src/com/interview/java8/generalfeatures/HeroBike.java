package com.interview.java8.generalfeatures;

public class HeroBike implements Bike{
    @Override
    public void bikeCompany() {
        System.out.println("This is the hero bike.");
    }
    // Optionally, override the default method
    @Override
    public void defaultBikeFunction() {
        System.out.println("This is the overridden implementation of the default method in HeroBike.");
        Bike.super.defaultBikeFunction();
    }
}
