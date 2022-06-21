package org.java.tutorials.designpatterns.structural.bridge;

public abstract class Shape {
    //Composition - Implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
