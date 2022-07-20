package org.java.tutorials.designpatterns.creational.abstractfactory;

public abstract class Computer {
    public abstract String getRam();

    public abstract String getHdd();

    public abstract String getCpu();

    @Override
    public String toString() {
        return "RAM= " + this.getRam() + ", HDD=" + this.getHdd() + ", CPU=" + this.getCpu();
    }
}
