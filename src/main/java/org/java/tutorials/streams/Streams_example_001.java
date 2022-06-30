package org.java.tutorials.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams_example_001 {
    public static void main(String[] args) {
        //String[] students = {"A","B","C"};
        List<String> students = new ArrayList<>();
        students.add("Arun");
        students.add("Barun");
        students.add("Carun");
        students.add("Darun");
        students.add("Earun");
        students.add("Farun");
        students.add("Garun");
        students.add("Harun");
        students.add("Iarun");

        /*Optional<String> optional = Optional.ofNullable(Arrays.stream(students).findFirst().toString());
        System.out.println(Arrays.stream(students).filter(s->s.startsWith("A")));*/
        System.out.println("Number of Students : " + students.stream().count());
        System.out.println("All As : " + students
                .stream()
                .filter
                        (s->s.startsWith("A"))
                .collect(Collectors.toList())
                .get(0));
        System.out.println("All Bs : " + students
                .stream()
                .filter
                        (s->s.startsWith("B"))
                .collect(Collectors.toList())
                .get(0));
        System.out.println("All Cs : " + students
                .stream()
                .filter
                        (s->s.startsWith("C"))
                .collect(Collectors.toList())
                .get(0));
        System.out.println("All Ds : " + students
                .stream()
                .filter
                        (s->s.startsWith("D"))
                .collect(Collectors.toList())
                .get(0));
        System.out.println("All Es : " + students
                .stream()
                .filter
                        (s->s.startsWith("E"))
                .collect(Collectors.toList())
                .get(0));
        System.out.println("All Fs : " + students
                .stream()
                .filter
                        (s->s.startsWith("F"))
                .collect(Collectors.toList())
                .get(0));
        System.out.println("All Gs : " + students
                .stream()
                .filter
                        (s->s.startsWith("G"))
                .collect(Collectors.toList())
                .get(0));
        System.out.println("All Hs : " + students
                .stream()
                .filter
                        (s->s.startsWith("H"))
                .collect(Collectors.toList())
                .get(0));
        System.out.println("All Is : " + students
                .stream()
                .filter
                        (s->s.startsWith("I"))
                .collect(Collectors.toList())
                .get(0));
    }


}
