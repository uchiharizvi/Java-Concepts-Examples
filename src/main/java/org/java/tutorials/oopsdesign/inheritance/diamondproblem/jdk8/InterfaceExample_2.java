package org.java.tutorials.oopsdesign.inheritance.diamondproblem.jdk8;

public interface InterfaceExample_2 {
    default void newMethod() {
        System.out.println("default method");
    }

    void display(String str);
}
