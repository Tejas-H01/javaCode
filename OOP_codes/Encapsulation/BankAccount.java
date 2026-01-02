package OOP_codes.Encapsulation;
import java.util.Scanner;


public class BankAccount {

    private static int balance =1000;//this is the private variable
    private static int accountNumber = 220964;
    private static String accountHolderName="Tejas";



    public static int getbalance(){  // This is the getter class which only displays the balance
        return balance;
    }

    public static int getAccountNumber(){
        return accountNumber;
    }
// There both wont be no setter class as balance , Acc no. cant be directly modified

    public static String getAccountHolderName(){
        return accountHolderName;
    }
    public static void setAccountHolderName(String name){
        accountHolderName=name;
    }
    public static void main(String[] args){
        BankAccount ba = new BankAccount();

        //String accountName ;
        String choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("___________________________________________________-");
        System.out.println("Do you want to change the Account holder name ? (yes/no)");
        choice=sc.next();
        System.out.println("___________________________________________________-");
        if(choice.equals("yes")) {
            System.out.print("Enter your new Account name : ");
            accountHolderName = sc.next();
            System.out.println("Account Holder Name : "+ accountHolderName);
        }else {
            System.out.println("Account Holder Name : " + accountHolderName);
        }
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance : "+ba.getbalance());
    }
}
