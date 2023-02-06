package com.example.streams;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

//public class FileReaderNIO {

//    Path path = Paths.get("src/main/java/com/example/streams/data/filereadernio/Profile.txt");

//    File file = new File(path.toUri());
//    RandomAccessFile aFile = new RandomAccessFile(path.getParent());
//    FileChannel inChannel = aFile.getChannel();


//    long fileSize = inChannel.size();

//    //Create buffer of the file size
//    ByteBuffer buffer = ByteBuffer.allocate((int) fileSize);
//        inChannel.read(buffer);
//        buffer.flip();
//
//    // Verify the file content
//        for(
//    int i = 0;
//    i<fileSize;i++)
//
//    {
//        System.out.print((char) buffer.get());
//    }
//} catch(
//        IOException e)
//
//        {
//        e.printStackTrace();
//        }
//
//
//        }
