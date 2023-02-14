package com.example.generics;

import java.util.LinkedList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {


        List list = new LinkedList();

        list.add(new Integer(2));
        list.add(new Integer(1));


        Integer i = (Integer) list.iterator().next();
        Integer ii = (Integer) list.iterator().next();

        System.out.println(i);
        System.out.println(ii);

        System.out.println(list);
    }
}
