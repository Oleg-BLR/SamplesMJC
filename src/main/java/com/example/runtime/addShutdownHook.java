package com.example.runtime;

public class addShutdownHook {
    // when the program is about to exit, this class extending the thread is called
    static class Mess extends Thread
    {
        public void run()
        {
            System.out.println("The program is going to exit");
        }
    }
    //main method is called
    public static void main(String[] args)
    {
        try
        {
//the class mess is registered as shut down hook
            Runtime.getRuntime().addShutdownHook(new Mess());
//The thread is made to sleep for certain seconds
            System.out.println("Five seconds of waiting time for the program to exit");
            Thread.sleep(5000);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
