package com.example.exceptions;

public class ThrowExcep {
    static void fun() {
        try {
            System.out.println("print inside fun()");
            throw new NullPointerException();
//            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw new NullPointerException("demo demo demo"); // rethrowing the exception

//            throw e; // rethrowing the exception
        }

    }

    public static void main(String args[]) {
        try {
            fun();
        } catch (NullPointerException e) {
            System.out.println("Caught in main.");
            System.out.println(e);
        }
    }
}
