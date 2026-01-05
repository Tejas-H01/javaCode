package OOP_codes.Inheritance.Vehicle;

public class Vehicle {

    private int speed ;

    private int model = 20023;

    private String brand="NEXA";

    private int year=2023;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String go(){
        System.out.println("The vehicle is Moving ");
        return "";
    }

    public void stop(){
        System.out.println("The vehicle stopped");
    }


}
