package org.example.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Mango");
        hs.add("Banana");
        hs.add("Mango");
        hs.add("Apple");
        hs.add("Cherry");
        hs.add("PineApple");
        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Mango");
        lhs.add("Banana");
        lhs.add("Mango");
        lhs.add("Apple");
        lhs.add("Cherry");
        lhs.add("PineApple");
        System.out.println(lhs);

        TreeSet<String> ths = new TreeSet<>();
        ths.add("Mango");
        ths.add("Banana");
        ths.add("Mango");
        ths.add("Apple");
        ths.add("Cherry");
        ths.add("PineApple");
        System.out.println(ths);
    }
}
