package OOP_codes.Inheritance.Vehicle;
import java.util.Scanner;

public class Car extends Vehicle {

    Scanner sc = new Scanner(System.in);

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public void go(){
        System.out.println("The car is moving !");
    }

    @Override
    public void stop(){
        System.out.println("The Car stopped !");
    }
}
