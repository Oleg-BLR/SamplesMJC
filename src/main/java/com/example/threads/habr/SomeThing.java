package com.example.threads.habr;

class SomeThing	implements Runnable	{	//Нечто, реализующее интерфейс Runnable, содержащее метод run

    public void run()		//Этот метод будет выполняться в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }
}