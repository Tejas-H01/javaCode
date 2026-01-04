package OOP_codes.Inheritance.Emp;

public class Test {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.employeeName="Tejas";
        System.out.println("Employee : "+m.employeeName);

        int returnedSalary = m.calculateSalary();   // method call
        System.out.println("Total salary: " + returnedSalary);

    }
}
