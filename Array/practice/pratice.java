package Array;
import java.util.Scanner;

public class pratice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n=0;

        System.out.print("Enter the array length :");
        n= sc.nextInt();

        int[]  arr = new int[n];

        for(int i =0 ; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        for (int i =0 ; i < arr.length;i++){
            System.out.printf("%d-> %d \n",i,arr[i]);
        }


    }
}
