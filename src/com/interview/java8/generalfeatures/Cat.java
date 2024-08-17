package com.interview.java8.generalfeatures;

public class Cat implements  Animal{
    public static void main(String[] args) {
        Animal.eatingBehaviour("Pet");
        Animal.livingBehaviour("pet");
    }

    @Override
    public void type() {
        System.out.println("Cat is pet animal");
    }
}
