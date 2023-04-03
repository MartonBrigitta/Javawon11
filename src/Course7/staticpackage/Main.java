package Course7.staticpackage;

public class Main {
    public static void main(String[] args) {
        AirPlane a1 = new AirPlane();
        AirPlane a2 = new AirPlane();

        a1.setType("type 1");
        a2.setType("type 2");
        System.out.println(a1.getType());

        a1.setGravityCoefficient(1.2);
        a2.setGravityCoefficient(3.1);
        System.out.println(a1.getGravityCoefficient());
    }
}
