package OOP_codes.Inheritance.Vehicle;

public class Vehicle {


    private String brand="NEXA";

    private int year=2023;

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
    public void go(){
        System.out.println("The vehicle is Moving ");

    }

    public void stop(){
        System.out.println("The vehicle stopped");
    }


}
