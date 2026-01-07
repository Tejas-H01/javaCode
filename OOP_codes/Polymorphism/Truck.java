package OOP_codes.Polymorphism;


public class Truck extends Vehicle  {

    @Override
    public int calculateRentalCost(int days){
        return (days*1000)+500;
    }
}
