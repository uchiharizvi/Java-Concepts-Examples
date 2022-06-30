package org.java.tutorials.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Lambdas_Example_004 {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("ankit");
        people.add("mayank");
        people.add("irfan");
        people.add("jai");
        people.forEach(p -> System.out.println(p));
    }
}
