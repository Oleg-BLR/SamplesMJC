package com.example.runtime;

public class exit {
    //main method is called
    public static void main(String[] args)
    {
        System.out.println("1.Checking if the program executes this statement before the use of exit(int status) method");

//the current runtime or program is caused to exit using exit(int status) method
        Runtime.getRuntime().exit(0);
//This statement is not executed because the program is terminated by the usage of exit(int status) method above
        System.out.println("Checking if the program executes this statement depsite the use of exit(int status) method");
    }
}
