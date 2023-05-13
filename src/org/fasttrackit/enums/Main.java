package org.fasttrackit.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CardinalPoints west = CardinalPoints.WEST;
        System.out.println(west.getSymbol());

        CardinalPoints north = CardinalPoints.NORTH;
        System.out.println(north.getSymbol());

        CardinalPoints east = CardinalPoints.EAST;
        System.out.println(east.getSymbol());

        CardinalPoints south = CardinalPoints.SOUTH;
        System.out.println(south.getSymbol());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a cardinal point");
        String line = scanner.nextLine();
        CardinalPoints cardinalPoints = CardinalPoints.fromName(line);
        if (cardinalPoints != null) {
            System.out.println("It's symbol is:" + cardinalPoints.getSymbol());
        }

        System.out.print("Enter a cardinal symbol: ");
        CardinalPoints fromSymbol = CardinalPoints.fromSymbol(scanner.nextLine());
        if (fromSymbol != null){
            System.out.println("The cardinal point is: "+fromSymbol.name());
        }

        System.out.println("Enter a cardinal symbol: ");
        fromSymbol = cardinalPoints.fromSymbol(scanner.nextLine());
        if (fromSymbol != null) {
            System.out.println("You need to go " + fromSymbol.toDirection());
        }
    }
}
