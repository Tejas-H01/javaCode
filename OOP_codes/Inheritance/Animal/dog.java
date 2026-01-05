package OOP_codes.Inheritance.Animal;

public class dog extends animal{


    @Override
    public String setName(String name) {
        return super.setName(name);
    }

    @Override
    public void sayHello(){
        System.out.println("bowww boww");
    }
}
