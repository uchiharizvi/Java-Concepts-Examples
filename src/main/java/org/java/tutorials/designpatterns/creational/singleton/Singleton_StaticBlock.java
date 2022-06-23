package org.java.tutorials.designpatterns.creational.singleton;

public class Singleton_StaticBlock {
    private static Singleton_StaticBlock instance;

    private Singleton_StaticBlock() {
    }

    static {
        try {
            instance = new Singleton_StaticBlock();
        } catch (Exception ex) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Singleton_StaticBlock getInstance() {
        return instance;
    }
}
