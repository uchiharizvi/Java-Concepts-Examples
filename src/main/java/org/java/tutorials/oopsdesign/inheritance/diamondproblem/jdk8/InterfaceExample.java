package org.java.tutorials.oopsdesign.inheritance.diamondproblem.jdk8;

public interface InterfaceExample {
    default void newMethod() {
        System.out.println("default method");
    }

    void existingMethod(String str);
}
