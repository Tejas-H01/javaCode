package OOP_codes.Inheritance.Animal;

public class animal {

    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("This animal is eating food!!");
    }

    public void sayHello(){
        System.out.println("");
    }
}
