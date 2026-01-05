package OOP_codes.Inheritance.Vehicle;

public class Car extends Vehicle {

    String brand="BMW";
    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public String getBrand() {
        return brand;
    }
}
