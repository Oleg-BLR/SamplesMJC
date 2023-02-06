package com.example.streams;

import java.io.*;

public class CopyCharacrers {
    public static void main(String[] args) throws IOException { //throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("src/main/java/com/example/streams/data/copycharacters/inputFileReader.txt");
//            inputStream = new FileReader("inputFileReader.txt");
            outputStream = new FileWriter("src/main/java/com/example/streams/data/copycharacters/outputFileWriter.txt");
//            outputStream = new FileWriter("outputFileWriter.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
