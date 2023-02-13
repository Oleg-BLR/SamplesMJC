package com.example.threads.habr;

public class Program			//Класс с методом main()
{
    static SomeThing mThing;	//mThing - объект класса, реализующего интерфейс Runnable

    public static void main(String[] args)
    {
        mThing = new SomeThing();

        Thread myThready = new Thread(mThing);	//Создание потока "myThready"
        myThready.start();				//Запуск потока

        System.out.println("Главный поток завершён...");

        Thread myThready2 = new Thread();
        myThready2.start();
    }
}