package Overloading;
import java.util.Scanner;


public class LoginVal {
    final   String username = "Tejas";
    final String password="GOAT";
    final int otp=6767;

    public  static void main(String[] args){

    LoginVal lv = new LoginVal();
    Scanner sc = new Scanner(System.in);
        System.out.println("___________________________________________________-");
    System.out.println("Enter the Username : ");
    String user=sc.next();

    System.out.println("Enter the Password : ");
    String pass=sc.next();

    lv.check(user,pass);

    System.out.println("Enter the OTP : ");
    int otp=sc.nextInt();
    lv.check(user,pass,otp);
        System.out.println("___________________________________________________-");
    sc.close();
    }

    void check(String a , String b){
        if (a.equals(username) && b.equals(password))
        {
            System.out.println("Access Granted");
        }else
            System.out.println("Access Denied");
    }

     void check(String a , String b , int c){
        if (a.equals(username) && b.equals(password)&& c==this.otp){
            System.out.println("Access Granted");
        }else
            System.out.println("Access Denied");
    }

}
