package org.fasttrackit.exceptions;

import javax.print.AttributeException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomExceptionMain {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("")){
            usingMyException(10);
            System.out.println("I know it worked");
        } catch (MyException | MySecondException e) {
            System.out.println("I know it failed");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("fie ca e bine fie ca e rau");
        }
    }

    private static int usingMyException(int i) throws MyException, MySecondException {
        if (i < 0) {
            throw new MyException();
            }
        if(i==0){
            throw new MySecondException();
        }
        return i * 2;
    }
}
