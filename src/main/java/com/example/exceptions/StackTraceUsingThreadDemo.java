package com.example.exceptions;

public class StackTraceUsingThreadDemo {
    public static void main(String[] args) {
        methodA();
    }

    public static StackTraceElement[] methodA() {
        return methodB();
    }

    public static StackTraceElement[] methodB() {
        Thread thread = Thread.currentThread();
        return thread.getStackTrace();
    }
}
