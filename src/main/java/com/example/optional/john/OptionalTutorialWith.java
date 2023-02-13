package com.example.optional.john;

import java.util.Optional;

public class OptionalTutorialWith {

    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("John");
        Optional<Cat> optionalCat2 = Optional.of(findCatByName("John2").orElse(new Cat("UNNOWN for optionalCat2", 0)));
        System.out.println(optionalCat2.get().name);
        Cat myCat = optionalCat.orElse(new Cat("UNNOWN", 0));
        System.out.println(myCat.name);

//        Cat myCat3 = optionalCat.orElseThrow();
//        System.out.println(myCat3.name);

        System.out.println(optionalCat.map(Cat::getName)
                .orElse("Unnown3"));
////        if (optionalCat != null) {
//        if (optionalCat.isPresent()) {
//            System.out.println(Optional.ofNullable(optionalCat.get().getName()));
//            System.out.println(optionalCat.get().name);
//            System.out.println(optionalCat.get().getAge());
//        } else {
//            System.out.println(0);
//        }

    }

    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
//        return Optional.ofNullable(null);
        return Optional.ofNullable(cat);
//        return cat;
    }

}

//class Cat{
//    String name;
//    int age;
//
//    public Cat(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
