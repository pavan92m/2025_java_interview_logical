package com.interview.java8.generalfeatures;

public interface Animal {
    void type();

    static void eatingBehaviour(String type) {
        System.out.println("Animal eating Behaviour is : "+type);
    }

    static void livingBehaviour(String type) {
        System.out.println("Animal living Behaviour is : "+type);
    }
}
