package OOP_codes.Inheritance.Emp;


public class Manager extends Employee {


    public int calculateSalary(int b){
        return super.calculateSalary()+b;
    }
}
