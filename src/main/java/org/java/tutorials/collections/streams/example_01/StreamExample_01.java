package org.java.tutorials.collections.streams.example_01;

import java.util.ArrayList;
import java.util.List;

public class StreamExample_01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");
        long count = names.stream().filter(str->str.length()<6).count();
        System.out.println("There are "+count+" strings with length less than 6");
    }
}
