package org.fasttrackit.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[3];
        try {
            doSomethingRisky(a);
        } catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("oups!");
        }
        System.out.println("Printing smth imoportant");
    }

    private static void doSomethingRisky(int[] a){
        System.out.println(a[4]);
        System.out.println("after exception in method");
    }

    private static void doSomethingVisibleRisky(String path) throws FileNotFoundException {
        FileReader reader = new FileReader(path);
    }

    private static void doSomethingVisibleRisky2(String path){
        try {
            FileReader reader = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
}
