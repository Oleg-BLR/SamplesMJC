package com.example.runtime;

public class execStringCommandThrowsIOException {
    //main method is called
    public static void main(String[] args) {
        try {
// a process is created to execute google chrome
            Process proc = Runtime.getRuntime().exec("google-chrome");
            System.out.println("Successfully started google chrome");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
