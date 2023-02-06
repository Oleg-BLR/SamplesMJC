package com.example.methodReferences;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences {

    public static void main(String[] args) {

//      1) Reference to a static method For example:
        Function<String, Boolean> function = e -> Boolean.valueOf(e);
        System.out.println(function.apply("TRUE"));
//        Let's rewrite using the method reference:
        Function<String, Boolean> function2 = Boolean::valueOf;
        System.out.println(function2.apply("TRUE"));

//        2) Reference to an instance method of an arbitrary object of a particular type.
//        This type is used when a lambda expression calls a method on an external, pre-existing object.
//        For example:

        Consumer<String> consumer = e -> System.out.println(e);
        consumer.accept("OCPJP 8");
//        Let's rewrite using a method reference:
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("OCPJP 8");

//        One more example:

        Integer i = 5;
        Supplier<String> supplier = () -> i.toString();
        System.out.println(supplier.get());
//        Rewritten using method reference:
        Supplier<String> supplier2 = i::toString;
        System.out.println(supplier2.get());

//       3) Reference to an instance method of a particular object
        Function<String, String> function3 = s -> s.toLowerCase();
        System.out.println(function3.apply("OCPJP 8"));
//        Rewritten using method reference:
        Function<String, String> function4 = String::toLowerCase;
        System.out.println(function4.apply("OCPJP 8"));

//        4) Reference to a constructor
        Function<String, Integer> function5 = (d) -> new Integer(d);
        System.out.println(function5.apply("4"));
//        Rewritten using method reference:
        Function<String, Integer> function6 = Integer::new;
        System.out.println(function6.apply("4"));

        Function<Integer, Integer> function7 = (d) -> new Integer(d);
        System.out.println(function5.apply(String.valueOf(4)));
//        Rewritten using method reference:
        Function<Integer, Integer> function8 = Integer::new;
        System.out.println(function6.apply("4"));

    }

}
