package dk.kea.dat18i.spring.demo;

public class Car {
    private int id;
    private String reg;
    private String brand;
    private String color;
    private double maxSpeed;

    public Car() {
    }

    public Car(int id, String reg, String brand, String color, double maxSpeed) {
        this.id = id;
        this.reg = reg;
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", reg='" + reg + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
