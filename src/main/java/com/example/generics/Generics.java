package com.example.generics;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        Integer[] array = new Integer[]{64, 42, 73, 41, 32, 44, 55};

        List<Integer> list = new LinkedList<>();
        Collections.addAll(list, array);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        list.add(new Integer(1));
//        list.add(new Integer(2));
//        list.add(3);
//        System.out.println();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        System.out.println();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
//            Integer i = (Integer) list.iterator().next();
            Integer i = iterator.next();
//            System.out.println();
            System.out.println(i);
        }
//        int someIterable = new String();
//
//        for (Iterator<int> i = someIterable.iterator(); i.hasNext();) {
//            String item = i.next();
//            System.out.println(item);
//        }

//for (list l: )
//        Integer i = (Integer) list.iterator().next();
//        System.out.println(i);
    }
}
