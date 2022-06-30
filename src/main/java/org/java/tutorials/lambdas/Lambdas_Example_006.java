package org.java.tutorials.lambdas;

public class Lambdas_Example_006 {
    public static void main(String[] args) {
        Sayable say = () -> "I have nothing to say.";
        System.out.println(say.say());
    }
}
