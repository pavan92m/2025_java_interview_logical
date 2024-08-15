package com.interview.design_pattern;
public class Singleton {

    // Volatile keyword ensures that multiple threads handle the instance variable correctly
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Optional: Add initialization code here if needed
    }

    // Global access point to the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Optional: Add your Singleton methods here
    public void someMethod() {
        System.out.println("Singleton instance is doing something.");
    }
}
