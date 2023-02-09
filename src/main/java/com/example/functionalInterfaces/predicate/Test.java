package com.example.functionalInterfaces.predicate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void main(String args[]) {
//        List names = Arrays.asList("John", "Jacky", "Jason", "Barry", "Frank");
//        System.out.print("\nDisplay All names : ");
//        process(names, c -> true);
//
//        System.out.print("\nDisplay No names : ");
//        process(names, c -> false);
//
//        System.out.print("\nDisplay names which startswith 'J' : ");
//        process(names, c -> c.startsWith("J"));
//
//        System.out.print("\nDisplay names which ends with 'n' : ");
//        process(names, c -> c.endsWith("n"));
//
//        System.out.print("\nDisplay names which are longer than 4 character : ");
//        process(names, c -> c.length() > 4);
//
//        Predicate startsWithJ = (n) -> {
//            return n.startsWith("J");
//        };

    }

    public static void process(Collection names, Predicate condition){
        for(Object name : names){
            if(condition.test(name)){
                System.out.printf("%s, ", name);
            }
        }
    }


}
