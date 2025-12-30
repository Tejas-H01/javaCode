
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("___________________________________________________-");

        System.out.print("Enter the number :");
        int num=sc.nextInt();

        System.out.println("Factorial : "+fact(num));
        System.out.println("___________________________________________________-");
    }

    static long fact(long x){
        if(x==1){
            return 1;
        }
        return x*fact(x-1);
    }
}
