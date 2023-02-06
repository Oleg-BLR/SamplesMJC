package com.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamToCollect {

    public static void main(String[] args) {

        int numberOfDishes = 5;

        List<Integer> initialDishOrder = IntStream.rangeClosed(1, numberOfDishes)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(initialDishOrder);

        String[] initialStringArray = new String[]{"one", "Two", "Abc"};
        Arrays.sort(initialStringArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        Comparator.reverseOrder();
        System.out.println(Arrays.toString(initialStringArray));
        System.out.println(join(initialStringArray));

        System.out.println(Arrays.asList(initialStringArray)
                .stream()
                .map(d -> d.toUpperCase())
                .collect(Collectors.joining("; ")));

    }

    public static String join(String[] arrayOfString) {
        return Arrays.asList(arrayOfString)
                .stream()
                .map(x -> x.toLowerCase())
                .collect(Collectors.joining(";"));
    }

}
