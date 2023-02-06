package com.example.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBites {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/main/java/com/example/streams/data/copybites/xanadu.txt");
//            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("src/main/java/com/example/streams/data/copybites/outagain.txt", true);
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
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