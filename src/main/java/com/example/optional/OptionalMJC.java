package com.example.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class OptionalMJC {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 6, 5, -7));
        ArrayList<Integer> numbers = new ArrayList<>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        if(min.isPresent()){
            System.out.println(min);
            System.out.println(min.orElse(-10000));
            System.out.println(min.get());
        } else {
            System.out.println("array is empty");
            System.out.println(min.orElse(-10000));
        }

        Optional<Integer> minOrElse = numbers.stream().min(Integer::compare);
        System.out.println("minOrElse - " + minOrElse.orElse(-1));
//        System.out.println(minViaStream.orElse("array is empty"));

        Optional<Integer> minWithRandom = numbers.stream().min(Integer::compare);
        Random random = new Random();
        System.out.println("minWithRandom - " + minWithRandom.orElseGet(() -> random.nextInt(100)));

        try {
            System.out.println(min.orElseThrow(IllegalStateException::new));
        } catch (IllegalStateException e) {
            System.out.println("minWithOrElseTrow");
        }

        Optional<Integer> minIfPresent = numbers.stream().min(Integer::compare);
        minIfPresent.ifPresent(v -> System.out.println(v));

        Optional<Integer> minIfPresentOrElse = numbers.stream().min(Integer::compare);
        minIfPresentOrElse.ifPresentOrElse(
                v -> System.out.println(v),
                () -> System.out.println("Value not found")
        );


    }
}
