package com.example.runtime;

public class freeMemory {
    //main method is called
    public static void main(String[] args) {
//The amount of free memory available is given by using freememory() method
        System.out.println("The amount of free memory available is " + Runtime.getRuntime().freeMemory());
    }
}
