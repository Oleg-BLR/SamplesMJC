package com.example.functionalInterfaces;

public class PredicateMain {

    public static void main(String[] args) {

        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;

        System.out.println(isEvenNumber.test(4));
        System.out.println(isEvenNumber.test(3));


    }

        @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

}
