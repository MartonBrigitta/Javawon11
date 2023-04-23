package org.fasttrackit.curs10;

import java.io.*;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws IOException {
        readingWithBufferReader();

    }

    private static void readingWithBufferReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/content.txt"));
        String line;
        while ((line = bufferedReader.readLine()) !=null){
            System.out.println(line);
        }
    }

    private static void readNumbers() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files", "content.txt"));
        while (scanner.hasNext()){
            System.out.println(scanner.nextInt());
        }
    }

    private static void readFullLine() throws FileNotFoundException {
        Scanner s = new Scanner(new File("files","content.txt"));
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }

    private static void readOneLine() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files", "content.txt"));
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
    }
}
