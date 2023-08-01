package org.example.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

//        ArrayList a = new ArrayList<>();
//        a.add(1);
//        a.add("hi");
//        a.add(5);
//
//        System.out.println(a + ", size: " + a.size());
//        a.set(1, "hi replaced with bye");
//        System.out.println(a);
//        a.remove(0);
//        System.out.println(a);
//        System.out.println(a.contains(1));
//        a.clear();
//        System.out.println(a);

//        ArrayList<Integer> n1 = new ArrayList<Integer>();
//        n1.add(5);
//        n1.add(6);
//
//        ArrayList<Integer> n2 = new ArrayList<Integer>();
//        n2.add(7);
//        n2.add(8);
//
//        n1.addAll(n2);
//        System.out.println(n1);
//
//        for(Integer n : n1){
//            System.out.println(n);
//        }

        ArrayList<Product> products = new ArrayList<>();

        Product p1 = new Product();
        p1.id = 1;
        p1.category = "Laptop";
        p1.name = "macbook pro m2";
        p1.price = 120000;

        Product p2 = new Product();
        p2.id = 3;
        p2.category = "Laptop";
        p2.name = "macbook pro m1";
        p2.price = 120000;

        Product p3 = new Product();
        p3.id = 2;
        p3.category = "Laptop";
        p3.name = "macbook air m2";
        p3.price = 120000;

        products.add(p1);
        products.add(p2);
        products.add(p3);


        Collections.sort(products);
        System.out.println(products);

    }
}
