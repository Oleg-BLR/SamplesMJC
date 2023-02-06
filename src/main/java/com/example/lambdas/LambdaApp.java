package com.example.lambdas;

@FunctionalInterface
interface Operationable {
    int calculate(int x, int y);
}

interface MultiplicationFuncInterface{
    int mult(int a, int b);
}

interface MyInterfaceNoParam{
    int calculate();
}

public class LambdaApp {

    static int x = 10;
    static int y = 200;

    public static void main(String[] args) {
        Operationable operation = (x, y) -> { return x + y; };
        int result = operation.calculate(10, 20);
        int result2 = operation.calculate(x, y);
        System.out.println(result); //30
        System.out.println(result2);

        MultiplicationFuncInterface op = (a, b) -> {
            return a * b;
        };

        int multRes = op.mult(5, 8);
        System.out.println(multRes);

        MyInterfaceNoParam myInterfaceNoParam = () -> {
            int c = 2;
            int d = 8;
            return c * d;
        };

        System.out.println("MyInterfaceWithNoParam = " + myInterfaceNoParam.calculate());

    }
}