package OOP_codes.Polymorphism;
import java.util.Scanner;
public class Test {

    public static void main(String[] args){

        int Days,Transport;
        int TotalCost=0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the days you want to rent :");
        Days=sc.nextInt();

        System.out.println("Select Vehicle\n1.CAR\n2.BIKE\n3.TRUCK");
        Transport=sc.nextInt();

        switch (Transport){
            case 1:
                Vehicle car = new Car();
                TotalCost = car.calculateRentalCost(Days);
                System.out.printf("The rental cost for car for %d days :   %d",Days,TotalCost);
                break;

            case 2:
                Vehicle bike = new Bike();
                TotalCost = bike.calculateRentalCost(Days);
                System.out.printf("The rental cost for bike for %d days :   %d",Days,TotalCost);
                break;

            case 3:
                Vehicle truck = new Truck();
                TotalCost = truck.calculateRentalCost(Days);
                System.out.printf("The rental cost for truck for %d days :   %d",Days,TotalCost);
                break;

            default:
                System.out.println("Invaild option!!");
        }

        sc.close();
    }
}
