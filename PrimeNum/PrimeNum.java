import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args){
    int num;

    Scanner sc = new Scanner(System.in);
        System.out.println("___________________________________________________-");
    System.out.print("Enter your Number :");
    num=sc.nextInt();
    System.out.println(num);
    System.out.println("Prime? :"+prime(num));
        System.out.println("___________________________________________________-");
    }

     static boolean prime(int x){
        int res=0;
         for(int i =1 ; i<= x /2 ; i++){
             if(x%i==0){
                 res+=1;
             }
         }

         return res==1;
    }
}
