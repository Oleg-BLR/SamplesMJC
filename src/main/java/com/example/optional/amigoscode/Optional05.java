package com.example.optional.amigoscode;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Optional05 {
    public static void main(String[] args) {
//        Optional<String> emptyString = Optional.ofNullable("valueForEmptyString");
        Optional<String> emptyString = Optional.ofNullable(null);

        try {
            System.out.println(emptyString.get());
        } catch (NoSuchElementException e) {
            System.out.println("no such element exception");
        }

        System.out.println(emptyString.isPresent());
        System.out.println(emptyString.isEmpty());

        Object orElse = emptyString
                .map(String::toUpperCase)
                .orElse("world".toUpperCase());
        System.out.println(orElse);

        try {

            Object orElseTrow = emptyString
                    .map(String::toUpperCase)
//                    .orElseThrow(IllegalStateException::new);
                    .orElseThrow(Exception::new);
            System.out.println(orElseTrow);
        } catch (IllegalStateException e) {
            System.out.println("illigal state exception");
        } catch (Exception e) {
            System.out.println("exception");
//            throw new RuntimeException(e);
        }
        System.out.println("continuation");


        System.out.println(emptyString);






    }
}
