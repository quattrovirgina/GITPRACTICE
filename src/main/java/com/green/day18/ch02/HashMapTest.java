package com.green.day18.ch02;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", 10);
        map.put("b", 20);
        map.put("b", 30);

        int cnt = 0;

        Object obj = map.get("a");
        Object obj2 = map.get("b");
        int val = (int)obj;
        int val2 = (int)obj2;
        System.out.println("val : " + val);
        System.out.println("val : " + val2);
        System.out.println("---------------------------------");
        Map<String, Integer> map2 = new HashMap();
        map2.put("Tv", 0);
        map2.put("Computer", 0);
        map2.put("Audio", 0);

        map2.put("Tv", 1);
        map2.put("Computer", 1);
        map2.put("Audio", 1);


        System.out.println("Tv-count: "+map2.get("Tv"));

    }
}
