package org.java.tutorials.designpatterns.structural.decorator;

public class Sportscar extends CarDecorator {
    public Sportscar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
