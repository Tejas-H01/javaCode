package OOP_codes.Inheritance.Emp;


public class Manager extends Employee {

    int b = 10000;
    public int calculateSalary()
    {
        return super.calculateSalary()+b;
    }
}
