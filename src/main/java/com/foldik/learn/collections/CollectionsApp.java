package com.foldik.learn.collections;


import java.util.*;

public class CollectionsApp {

    public static void main(String[] args) {
        String[] names = new String[10];

        List<CollectionsApp> list = new ArrayList<>();
        list.add(new CollectionsApp());
        list.add(new CollectionsApp());
        list.add(new CollectionsApp());
        list.add(new CollectionsApp());
        list.add(new CollectionsApp());
        list.add(new CollectionsApp());
        list.add(new CollectionsApp());

        String m = "Macska";

        String b = "Macska";

        String c = new String("Macska");

        System.out.println((m == b) ? "m = b" : "m != b");
        System.out.println((m == c) ? "m = c" : "m != c");
        System.out.println((m.equals(c)) ? "m = c" : "m != c");

        Set<Point> uniqe = new HashSet<>();

        uniqe.add(new Point(0, 0));
        uniqe.add(new Point(1, 0));
        uniqe.add(new Point(2, 0));
        uniqe.add(new Point(0, 0));
        uniqe.add(null);

        for (Point p : uniqe) {
            System.out.println(p);
        }

        Map<Point, String> map = new HashMap<>();
        map.put(new Point(0, 0), "Macska");
        map.put(new Point(1, 1), "Macska");
        map.put(new Point(0, 0), "Macska");

        for(Map.Entry element : map.entrySet()) {
            System.out.println("Key: " + element.getKey());
            System.out.println("Value: " + element.getValue());
        }


    }
}
