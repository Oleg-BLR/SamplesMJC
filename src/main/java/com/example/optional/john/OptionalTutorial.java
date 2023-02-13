package com.example.optional.john;

public class OptionalTutorial {

    public static void main(String[] args) {
        Cat myCat = findCatByName("John");
        if (myCat != null) {

            System.out.println(myCat.age);
            System.out.println(myCat.getAge());
        } else {
            System.out.println(0);
        }
    }

    private static Cat findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        return cat;
//        return cat;
    }
}


