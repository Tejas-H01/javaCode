package OOP_codes.Abstraction;

public   class UPIPayment extends Payment{
    private double dailyLimit = 2000;

    @Override
    public boolean makePayment(double amount) {
        if (amount <= dailyLimit) {
            dailyLimit -= amount;
            System.out.println("UPI payment successful.");
            return true;
        } else {
            System.out.println("UPI daily limit exceeded.");
            return false;
        }
    }
}
