package com.example.threads;

public class MainForThreads {

    public static void main(String[] args) {

        System.out.println("11111111111");
        int n = 8; // Number of threads
        for (int in = 0; in < n; in++) {
            MultithreadingDemoExtendsThread object
                    = new MultithreadingDemoExtendsThread();
            object.start();
            System.out.println("in = " + in);
        }

        System.out.println("2222222222222");

        int m = 8; // Number of threads
        for (int im = 0; im < m; im++) {
            Thread object
                    = new Thread(new MultithreadingDemoImplementsRunnable());
            object.start();
//            object.getPriority();
            System.out.println("im = " + im);
        }
        System.out.println("3333333333333");

    }


}
