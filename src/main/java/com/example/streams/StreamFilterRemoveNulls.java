package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFilterRemoveNulls {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("cup", null, "forest",
                "sky", "book", null, "theatre");

        List<String> result = words.stream().filter(w -> w != null)
                .collect(Collectors.toList());

//        List<String> result = words.stream().filter(w -> w != null).findFirst();
//        Optional<String> result = words.stream().filter(w -> w != null).findFirst();

        System.out.println(result);
    }
}