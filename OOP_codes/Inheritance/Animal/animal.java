package OOP_codes.Inheritance.Animal;

public class animal {

    private String name;
    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }



    public void eat(){
        System.out.println("This animal is eating food!!");
    }

    public void sayHello(){
        System.out.println("");
    }
}
