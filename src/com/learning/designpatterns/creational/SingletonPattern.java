package com.learning.designpatterns.creational;

public class SingletonPattern {

    // Single instance of the class
    private static SingletonPattern instance;

    // Private constructor
    // Prevents object creation from outside the class
    private SingletonPattern() {
        System.out.println("Singleton object created");
    }

    // Provides access to the single object
    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;

    }

    // Sample business method
    public void doSomething() {
        System.out.println("Doing some work...");
    }


    public static void main(String[] args) {
        // Getting Singleton object
        SingletonPattern obj1 = SingletonPattern.getInstance();


        // Getting Singleton object again
        SingletonPattern obj2 = SingletonPattern.getInstance();

        obj1.doSomething();
        obj2.doSomething();

        // Check whether both references point
        // to the same object
        System.out.println("Same object: " + (obj1 == obj2));
    }

}
