package org.java.tutorials.interviews.visa;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        String a = "HelloWorld";
        char[] ch = a.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character elem : ch) {
            if (map.containsKey(elem)) {
                map.put(elem, map.get(elem) + 1);
            } else {
                map.put(elem, 1);
            }
        }
        System.out.println(map);
        Map<String, Integer> sortedMap = new HashMap<>();
        sortedMap = sort(map);
        System.out.println(sortedMap);
    }

    private static HashMap<String, Integer> sort(Map<Character, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>((Collection<? extends Map.Entry<String, Integer>>) map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
