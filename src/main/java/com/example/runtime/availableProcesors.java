package com.example.runtime;

public class availableProcesors {
    //main method is called
    public static void main(String[] args) {
//checking for the number of available processors using availableprocessors() method.
        System.out.println("The number of available processors are " + Runtime.getRuntime().availableProcessors());
    }
}
