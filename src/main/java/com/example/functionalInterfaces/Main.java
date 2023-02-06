package com.example.functionalInterfaces;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
//Predicate
        System.out.println("---------");
        System.out.println("Output for Predicate");

        Predicate<String> lenthIsEven = s -> s.length() % 2 == 0;
        System.out.println("Predicate lenthIsEnen for ???" + "s" + " - " + lenthIsEven.test("oioi"));
        System.out.println("Predicate lenthIsEnen for ???" + " - " + lenthIsEven.test("oiooi"));

        Predicate<Integer> isEvenNumber = x -> x % 2==0;

        System.out.println("Predicate isEvenNumber for ???" + isEvenNumber.test(4));
        System.out.println("Predicate isEvenNumber for ???" + isEvenNumber.test(3));
        System.out.println("---------");


        Function<Integer, Double> function = t -> Double.valueOf(t / 3);
        Function<Integer, Double> f = t -> t / 4.0;
        System.out.println(function.apply(12));
        System.out.println(f.apply(20));

        ArrayList<String> nameList = new ArrayList<>();
        nameList .add("Elena");
        nameList .add("John");
        nameList .add("Alex");
        nameList .add("Jim");
        nameList .add("Sara");

        Supplier<String> randomName = () -> {
            int value = (int)(Math.random() * nameList.size());
            return nameList.get(value);
        };

        System.out.println(randomName.get());

//        Converter()


    }

    @FunctionalInterface
    public interface Converter<T, N> {
        N convert(T t);
    }

    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }


}
