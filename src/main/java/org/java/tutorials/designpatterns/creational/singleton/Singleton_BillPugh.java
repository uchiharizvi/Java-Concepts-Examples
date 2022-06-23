package org.java.tutorials.designpatterns.creational.singleton;

public class Singleton_BillPugh {
    private Singleton_BillPugh() {
    }

    private static class Singleton_BillPugh_Helper {
        private static final Singleton_BillPugh INSTANCE = new Singleton_BillPugh();
    }

    public static Singleton_BillPugh getInstance() {
        return Singleton_BillPugh_Helper.INSTANCE;
    }
}
