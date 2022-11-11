package com.example.runtime;

public class totalMemory {
    //main method is called
    public static void main(String[] args) {
//The amount of total memory available is given by using totalmemory() method
        System.out.println("The amount of free memory available is " + Runtime.getRuntime().totalMemory());
    }
}
