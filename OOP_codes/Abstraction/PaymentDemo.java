package OOP_codes.Abstraction;

import java.util.Scanner;

public class PaymentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Payment payment = null;

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                payment = new CreditCardPayment();
                break;

            case 2:
                payment = new UPIPayment();
                break;

            case 3:
                payment = new NetBankingPayment();
                break;

            default:
                System.out.println("Invalid payment choice.");
                sc.close();
                return;
        }

        // Abstraction in action
        payment.paymentInfo();
        boolean status = payment.makePayment(amount);

        if (status) {
            System.out.println("Payment completed successfully.");
        } else {
            System.out.println("Payment failed.");
        }

        sc.close();
    }
}
