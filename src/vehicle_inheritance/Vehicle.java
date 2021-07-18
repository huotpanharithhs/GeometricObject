package vehicle_inheritance;

public class Vehicle {
    private String brand = "Honda";
    public void sound(){
        System.out.println("Tuut, tuut");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

