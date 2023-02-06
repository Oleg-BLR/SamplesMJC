package com.example.string;

public class WorkWithString {
    public static void main(String[] args) {


        String str1 = "Hello World";
        String str2 = "Hello World";

        String str3 = new String("Hello World");

        System.out.println(str2 == str1);
        System.out.println(str3 == str1);

        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);

        result = str3.compareTo(str1);
        System.out.println(result);

        String str4 = str1.concat(str3);
        System.out.println(str4);

    }
}
