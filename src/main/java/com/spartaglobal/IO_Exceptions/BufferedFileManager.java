package com.spartaglobal.IO_Exceptions;

import java.io.*;
import java.lang.management.BufferPoolMXBean;

public class BufferedFileManager {

    public void readerWriter() throws IOException {
        File file = new File("resources/TestFile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        //new file to be managed by buffered writer
        File newfile = new File("resources/newFile.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(newfile));

        //line manager variable
        String line;

        while ((line = reader.readLine()) != null) {
            if (!line.equals("")){
                writer.append(line + "\n");
                System.out.println("friyay");
            }
        }
     writer.flush();
        writer.close();
        reader.close();
    }

}
