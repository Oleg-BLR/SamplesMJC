package com.example.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileStream {
    public static void main(String[] args) throws IOException { //throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/main/java/com/example/streams/data/copyfilestream/input.txt");
            out = new FileOutputStream("src/main/java/com/example/streams/data/copyfilestream/output.txt", true);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
//                System.out.println(out.write(c));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
