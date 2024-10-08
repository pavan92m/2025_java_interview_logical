package com.interview.java8.generalfeatures;

public class BikeRun {
    public static void main(String[] args) {
        Bike bajajBike = new BajajBike();
        bajajBike.bikeCompany();
        bajajBike.defaultBikeFunction();

        Bike heroBike = new HeroBike();
        heroBike.bikeCompany();
        heroBike.defaultBikeFunction();
        Bike.wheels();
    }
}
