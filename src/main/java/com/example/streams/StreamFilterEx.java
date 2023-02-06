package com.example.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEx {

    public static void main(String[] args) {

        List<String> words = List.of("pen", "custom", "orphanage",
                "forest", "bubble", "butterfly");

        List<String> result = words.stream().filter(word -> word.length() < 7)
                .collect(Collectors.toList());
//                .forEach(System.out::println);

        result.forEach(word -> System.out.println(word));
//        result.forEach(word -> System.out::print);
        System.out.println(words);
        System.out.println(result);

//        https://www.baeldung.com/java-8-streams

//        Stream<String> streamBuilder =
//                Stream.<String>builder().add("a").add("b").add("c").build();
//        System.out.println(streamBuilder);
//        streamBuilder.forEach(a -> System.out.print(a));


//        int sum = widgets.stream()
//                .filter(w -> w.getColor() == RED)
//                .mapToInt(w -> w.getWeight())
//                .sum();

    }
}