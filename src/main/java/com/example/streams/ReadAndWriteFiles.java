package com.example.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteFiles {

    public static void main(String[] args) throws IOException {
        String directory = System.getProperty("user.home");
//        String directory02 = System.getProperty("/Users/olegdeviatovski/IdeaProjects/SamplesMJC/src/main/java/com/example/streams/data/readandwritefiles");
        String directory02 = "/Users/olegdeviatovski/IdeaProjects/SamplesMJC/src/main/java/com/example/streams/data/readandwritefiles";

        System.out.println("---");
        System.out.println(directory);
        System.out.println(directory02);

        String filename = "sample.txt";
        System.out.println(filename);
        String absolutePath = directory + File.separator + filename;
        String absolutePath02 = directory02 + File.separator + filename;
        System.out.println(absolutePath);
        System.out.println(absolutePath02);

        String FILE_NAME = "/Users/olegdeviatovski/IdeaProjects/SamplesMJC/src/main/java/com/example/streams/data/readandwritefiles/filetocreate.txt";

        FileOutputStream fileOutputStream02 = new FileOutputStream(FILE_NAME);
        fileOutputStream02.write(99);

        try (FileOutputStream fileOutputStream = new FileOutputStream(absolutePath02)){
            String fileContent = "This is a sample text.";
            fileOutputStream.write(fileContent.getBytes());
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
