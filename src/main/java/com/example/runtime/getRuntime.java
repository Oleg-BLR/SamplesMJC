package com.example.runtime;

//a class called program is defined
public class getRuntime
{
    //main method is called
    public static void main(String[] args)
    {
// The current runtime in association with process is obtained using getRuntime method.
        Runtime roll = Runtime.getRuntime();
// The current free memory for the current runtime is obtained using freeMemory() method.
        System.out.println("The current free memory for the current runtime is" + roll.freeMemory());
    }
}