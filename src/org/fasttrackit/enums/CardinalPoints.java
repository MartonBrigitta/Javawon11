package org.fasttrackit.enums;

public enum CardinalPoints {
    NORTH("N"), SOUTH("S"), WEST("W"), EAST("E");

    private final String symbol;

    CardinalPoints(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String toDirection(){
        return switch (this){
            case NORTH -> "Up";
            case SOUTH -> "Down";
            case EAST -> "Right";
            case WEST -> "Left";
        };
    }

    public static CardinalPoints fromName(String name) {
        CardinalPoints[] values = CardinalPoints.values();
        for(CardinalPoints cardinalPoint : values){
            if (cardinalPoint.name().equals(name.toUpperCase())) {
                return cardinalPoint;
            }
        }
        return null;
    }

    public static CardinalPoints fromSymbol(String symbol) {
        CardinalPoints[] values = CardinalPoints.values();
        for(CardinalPoints cardinalPoint : values){
            if (cardinalPoint.symbol.equals(symbol)) {
                return cardinalPoint;
            }
        }
        return null;

    }
}
