package org.fasttrackit.curs10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt", true));
        writer.write("This is the secoooond line");
        writer.newLine();
        writer.flush();
        writer.close();

    }
}
