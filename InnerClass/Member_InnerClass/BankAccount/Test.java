package InnerClass;

public class Test {
    public static void main(String[] args){

        // Constructors ensure objects are initialized at creation and prevent
        // usage of uninitialized or inconsistent objects.

        BankAccount bank = new BankAccount("Tejas",51000);

        bank.deposit(1000);

        bank.withdraw(2000);

        bank.DisplayBalance();
    }
}
