package com.example.streams;

import java.io.File;

public class BaeldungJavaFileClass01 {

    public static void main(String[] args) {

        File directory = new File("dir");
        File file = new File(directory,"file.txt");
        System.out.println(directory.getAbsolutePath());
        directory.mkdir();

        System.out.println(file.getAbsolutePath());
    }

}
