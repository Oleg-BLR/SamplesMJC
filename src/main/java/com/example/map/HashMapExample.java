package com.example.map;

// Java Program to illustrate the Hashmap Class
import java.util.*;

public class HashMapExample {

    public static void main(String[] args)
    {
        Map<String, Integer> map
                = new HashMap<>();

        map.put("one", 10);
        map.put("one2", 10);
        map.put("one3", 10);
        map.put("one4", 10);
        map.put("one5", 10);
        map.put("one6", 10);
        map.put("two", 30);
        map.put("three", 20);
        map.put("three2", 20);
        map.put("three3", 20);
        map.put("three4", 20);

        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
}