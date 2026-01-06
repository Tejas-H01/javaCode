import java.util.Scanner;
public class NumberOfDigits {

    public static void main(String[] args){

        int Number ;
        int Count=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        Number=sc.nextInt();


        while( Number !=0){
            Count+=1;
            Number/=10;
        }

        System.out.println("Number of digits : "+Count);
    }

}
