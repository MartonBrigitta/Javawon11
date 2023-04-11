package org.fasttrackit.homework.exercise1;

import java.util.concurrent.CompletionStage;

public class Main {
    public static void main(String[] args) {
        Cosmetics c = new Cosmetics();

        Product p = c;

        Product[] products = new Product[2];
        products[0] = new Cosmetics();
        products[1] = new Product("product1");

        doSomething(new Cosmetics());
        doSomething(new Product("product2"));
    }

    public static void doSomething(Product product) {
        if (product instanceof Cosmetics) {
            System.out.println("Is cosmetics");
            Cosmetics cosmetics = (Cosmetics) product;
            System.out.println(cosmetics.getColor());
        }

        System.out.println(product.getName());
    }
}
