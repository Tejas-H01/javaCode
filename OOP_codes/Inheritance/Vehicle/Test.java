package OOP_codes.Inheritance.Vehicle;
import java.util.Scanner;
public class Test {

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        //Bike
        System.out.println("----------------BIKE--------------------");
        Bike c = new Bike();

        System.out.print("Enter the Bike brand: ");
        String brand= sc.next();
        c.setBrand(brand);

        System.out.print("Enter the Bike year: ");
        int y = sc.nextInt();
        c.setYear(y);


        System.out.println(c.getBrand());
        System.out.println(c.getYear());
        c.go();
        c.stop();



        //car
        System.out.println("----------------CAR--------------------");
        Car b = new Car();

        System.out.print("Enter the Car brand: ");
        brand= sc.next();
        b.setBrand(brand);

        System.out.print("Enter the Car year: ");
        y = sc.nextInt();
        b.setYear(y);


        System.out.println(b.getBrand());
        System.out.println(b.getYear());
        b.go();
        b.stop();
    }
}
