package vehicle_inheritance;

public class MainVehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.sound();
        System.out.println(myCar.getBrand());

        MotoBike dream = new MotoBike();
        dream.sound();
    }
}
