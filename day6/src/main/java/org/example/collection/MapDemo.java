package org.example.collection;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("dev", "Minku");
        hm.put("tester", "Anjali");
        hm.put("tester", "Deepa");
        hm.put("dev", "Simran");

//        System.out.println(hm);
//        System.out.println(hm.values());
//        System.out.println(hm.keySet());
//        System.out.println(hm.get("dev"));

        for(String key: hm.keySet()){
            System.out.println(hm.get(key));
        }
    }
}
