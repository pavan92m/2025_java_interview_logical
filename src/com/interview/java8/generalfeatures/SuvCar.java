package com.interview.java8.generalfeatures;

public class SuvCar implements  Car{
    @Override
    public void type() {
        System.out.println("This is SUV call");
    }

    public static void main(String[] args) {
        SuvCar suvCar = new SuvCar();
        suvCar.companyFeature("SUV");
    }
}
