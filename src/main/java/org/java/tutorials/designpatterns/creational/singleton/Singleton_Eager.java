package org.java.tutorials.designpatterns.creational.singleton;

public class Singleton_Eager {
    private static final Singleton_Eager instance = new Singleton_Eager();

    private Singleton_Eager() {
    }

    public static Singleton_Eager getInstance() {
        return instance;
    }
}
