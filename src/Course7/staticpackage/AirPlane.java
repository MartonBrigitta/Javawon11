package Course7.staticpackage;

public class AirPlane {
    private static double gravityCoefficient;
    private String type;
    private double fuel;

    public static double getGravityCoefficient() {
        return gravityCoefficient;
    }

    public static void setGravityCoefficient(double gravityCoefficient) {
        AirPlane.gravityCoefficient = gravityCoefficient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
