//This is Member Inner class
// Member inner classes are used when one class logically belongs to another
// and requires direct access to the outer class's private members.


package InnerClass;
//Outter Class
public class BankAccount {
    private String accountHolderName ;
    private int balance;

public BankAccount(String accountHolderName , int balance){ //This is the Constructor of this class
    this.accountHolderName = accountHolderName;
    this.balance=balance;
}

    public void deposit(int amt){
        this.balance = this.balance+amt;
        Transaction t = new Transaction("Deposit",amt); //Inner Class Obj Creation
        t.TransactionInfo();
    }

    public void withdraw(int amt){
        this.balance = this.balance-amt;
        Transaction t = new Transaction("Withdraw",amt);
        t.TransactionInfo();
    }

    public void DisplayBalance(){
        System.out.printf("Remaining Balance : %d%n", balance);
    }

//Inner Class
    public class Transaction{
        String transactionType;
        int Amount;

        //Constructor of inner class
        public Transaction(String type , int amt){
            this.transactionType = type;
            this.Amount = amt;
        }
        public void TransactionInfo(){
            System.out.println("Transaction Type : "+transactionType);
            System.out.println("Amount : "+Amount);
        }
    }
}
