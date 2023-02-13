package com.example.threads;

public class ExtendExample extends Thread{
    public static void main(String[] args) {
        ExtendExample thread = new ExtendExample();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
