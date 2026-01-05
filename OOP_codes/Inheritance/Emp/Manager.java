package OOP_codes.Inheritance.Emp;
import java.util.Scanner;

public class Manager extends Employee {

    Scanner sc = new Scanner(System.in);
    private int totalSalary;   // <-- this is what other classes can access

    @Override
    public int calculateSalary() {
        System.out.print("Enter the bonus amount: ");
        int bonus = sc.nextInt();

        System.out.println("Base Salary :"+basicSalary);

        totalSalary = super.calculateSalary() + bonus;
        return totalSalary;
    }

    // Getter method
    public int getTotalSalary() {
        return totalSalary;
    }
}
