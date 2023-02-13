package com.example.optional.amigoscode;

import java.util.Optional;

public class OptionalIfPresent {
    public static void main(String[] args) {

//        String stringToTry = "string to try";
        String stringToTry = null;
        String stringToTryNull;
        Optional<String> stringToTryOptionalBoxed = Optional.ofNullable(stringToTry);

        System.out.println(stringToTry);
        System.out.println(stringToTryOptionalBoxed.isPresent());
        System.out.println(stringToTryOptionalBoxed.isEmpty());
//        System.out.println(stringToTryOptionalBoxed.get());
        System.out.println(stringToTryOptionalBoxed.hashCode());

        stringToTryOptionalBoxed.ifPresent(s -> {
            System.out.println(s);
        });

        stringToTryOptionalBoxed.ifPresent(System.out::println);


    }

    @Override
    public int hashCode() {
        return 30;
//        return super.hashCode();
    }
}
