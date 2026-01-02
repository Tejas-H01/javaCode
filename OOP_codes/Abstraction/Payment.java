package OOP_codes.Abstraction;

public abstract class Payment {


    public abstract boolean makePayment(double amount);

    public void paymentInfo(){
        System.out.println("Processing online payment...");
        System.out.println("Ensure sufficient balance before proceeding.");
        System.out.println("Do not refresh or close the application during payment.");
    }
}
