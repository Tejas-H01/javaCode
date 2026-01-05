package OOP_codes.Inheritance.Animal;

public class cat extends animal{

    @Override
    public String setName(String name){
        return super.setName(name);
    }

    @Override
    public void sayHello(){
        System.out.println("meow meow");
    }
}
