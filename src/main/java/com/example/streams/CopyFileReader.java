package com.example.streams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFileReader {
    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        File inputFile = new File("/Users/olegdeviatovski/IdeaProjects/SamplesMJC/src/main/java/com/example/streams/data/copyfilereader/inputfile");
        File ounputFile = new File("/Users/olegdeviatovski/IdeaProjects/SamplesMJC/src/main/java/com/example/streams/data/copyfilereader/outputfile");

        String str = Files.readString(inputFile.toPath());
        System.out.println("str " + str);

        FileReader fileReader = new FileReader(inputFile.getPath());
        System.out.println("fileReader.toString() " + fileReader.toString());




//        String[] lines = StringUtils.split(FileUtils.readFileToString(new File("...")), '\n');
//        String[] lines = StringUtils.split(FileUtils.readFileToString(inputFile)), '\n');

        try {
            in = new FileReader(inputFile);
//            in = new FileReader("input.txt");
            out = new FileWriter(ounputFile, false);
//            out = new FileWriter("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
