package dk.kea.dat18i.spring.demo;

public class Car {
    private int reg;
    private String brand;
    private String color;
    private double maxSpeed;


    public Car(int reg, String brand, String color, double maxSpeed) {
        this.reg = reg;
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getReg() {
        return reg;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
