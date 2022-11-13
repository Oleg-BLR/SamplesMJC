package com.example.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEx {

    public static void main(String[] args) {

        List<String> words = List.of("pen", "custom", "orphanage",
                "forest", "bubble", "butterfly");

        List<String> result = words.stream().filter(word -> word.length() < 5)
                .collect(Collectors.toList());

        result.forEach(word -> System.out.println(word));
    }
}