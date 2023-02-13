package com.example.threads;

class MultithreadingDemoExtendsThread extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        int n = 8; // Number of threads
//        for (int i = 0; i < n; i++) {
//            MultithreadingDemo object
//                    = new MultithreadingDemo();
//            object.start();
//        }
//    }
//}
