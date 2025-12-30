package Overloading;
import java.util.Scanner;

public class areaCalc{

    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);

        int choice;
        int len,wid;
        float rad;

        System.out.println("Choice 1.Square  2.Rectangle 3.Circle");
        choice=sr.nextInt();


        switch(choice){
            case 1:
                System.out.println("Enter the length : ");
                len=sr.nextInt();
                System.out.println("Area of square : "+area(len));
                break;


            case 2:
                System.out.println("Enter the length : ");
                len=sr.nextInt();
                System.out.println("Enter the Width : ");
                wid=sr.nextInt();
                System.out.println("Area of reqtangle : "+area(len,wid));
                break;

            case 3:
                System.out.println("Enter the Radius : ");
                rad=sr.nextFloat();
                System.out.println("Area of reqtangle : "+area(rad));
                break;

            default:
                System.out.println("Please select the correct choice!!");

        }

    }

    public static int area(int a ){
        return a*a;
    }

    public static int area(int a , int b){
        return a*b;
    }

    public static float area(float rad){
        final float pi = 3.14f;
        return pi*rad*rad;
    }

}