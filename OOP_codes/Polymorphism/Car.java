package OOP_codes.Polymorphism;

public class Car extends Vehicle {

    @Override
    public int calculateRentalCost(int days){
        return (days*1500)+500;
    }
}
