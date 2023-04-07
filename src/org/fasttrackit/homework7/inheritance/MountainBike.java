package org.fasttrackit.homework7.inheritance;

public class MountainBike extends Bike {

    private int suspensionStrength;

    public MountainBike() {
        super(6);
    }

    public int getSuspensionStrength() {
        return suspensionStrength;
    }

    public void getSuspensionStrength(int suspensionStrength) {
        this.suspensionStrength = suspensionStrength;
    }

    @Override
    public void flatTyre(){
        System.out.println("This wheel was worth the money");
        tyrePressure = MAX_PRESSURE;
    }

    @Override
    public String toString() {
        return "MountainBike {" +
                "suspensionStrength=" + suspensionStrength +
                ", tyrePressure=" + tyrePressure +
                ", bikeWheel=" + bikeWheel +
                '}';
    }
}
