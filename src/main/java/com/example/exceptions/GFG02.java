package com.example.exceptions;

public class GFG02 {
    public static void main (String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
//        catch(ArrayIndexOutOfBoundsException ex){
//        catch(Exception e){
        catch(ArithmeticException ex){
            ex.printStackTrace();
        }
    }
}
