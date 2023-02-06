package com.example.streams;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamExample {
    public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
        byte content[] = "Jtp is the best website to learn new technologies".getBytes();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(content);

        inputStream.read(content);

        File newFile = new File("src/main/java/com/example/streams/data/inputoutputstreamexample/MyNewFile.txt");
        FileOutputStream outputStream = new FileOutputStream(newFile);
        outputStream.write(content);

    }
}
