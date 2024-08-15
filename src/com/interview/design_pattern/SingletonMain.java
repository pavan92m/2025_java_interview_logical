package com.interview.design_pattern;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.someMethod();
    }
}

