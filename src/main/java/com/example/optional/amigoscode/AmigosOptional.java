package com.example.optional.amigoscode;

import java.util.Optional;

public class AmigosOptional {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        // extract variable command option V
        System.out.println(empty);
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        Optional<String> emptyString = Optional.of("hello");
        Optional<String> emptyString2 = Optional.ofNullable(null);
        // multiple cursor double option and hold, with cursor extend lines
        //
        System.out.println(emptyString);
        System.out.println(emptyString.isPresent());
        System.out.println(emptyString.isEmpty());

        Object orElse = emptyString
                .map(String::toUpperCase)
                .orElse("world");
        System.out.println(orElse);

        Object orElse3 = emptyString2
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    String defaultReturn = "world from lambda supplier";

                    // extracomputation to retrieve value
                    // delete to word start option backspace
                    return defaultReturn.toUpperCase();
                });
        System.out.println(orElse3);


        Object orElse2 = emptyString2.orElse("world");
        System.out.println(orElse2);

    }
}
