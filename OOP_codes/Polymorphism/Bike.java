package OOP_codes.Polymorphism;

public class Bike extends Vehicle{

    @Override
    public int calculateRentalCost(int days){
        return (days*600)+500;
    }
}
