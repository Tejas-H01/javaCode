package OOP_codes.Abstraction;

public   class CreditCardPayment extends Payment{

    private double creditLimit = 5000;

    @Override
    public boolean makePayment(double amount) {
        if (amount <= creditLimit) {
            creditLimit -= amount;
            System.out.println("Credit Card payment successful.");
            return true;
        } else {
            System.out.println("Credit limit exceeded.");
            return false;
        }
    }

}
