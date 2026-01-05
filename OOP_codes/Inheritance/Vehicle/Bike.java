package OOP_codes.Inheritance.Vehicle;



public class Bike extends Vehicle    {


    @Override
    public void setYear(int year){
        super.setYear(year);
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public void go(){
        System.out.println("The Bike is Moving ");
    }
    @Override
    public void stop(){
        System.out.println("The Bike stopped");
    }
}
