package org.java.tutorials.designpatterns.creational.singleton;

public class Singleton_ThreadSafe {
    private static Singleton_ThreadSafe instance;
    private Singleton_ThreadSafe() {}

    public static synchronized Singleton_ThreadSafe getInstance() {
        if (instance == null) instance = new Singleton_ThreadSafe();
        return instance;
    }

    public static synchronized Singleton_ThreadSafe getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (Singleton_ThreadSafe.class){
                if (instance == null) instance = new Singleton_ThreadSafe();
            }
        }
        return instance;
    }
}
