package OOP_codes.Inheritance.Animal;

public class T {

    public static void main(String[] args){
        dog d = new dog();
        d.setName("Sujal");
        d.setAge(19);
        d.eat();
        d.sayHello();

        System.out.println("");
        cat c = new cat();
        c.setName("Tejas");
        c.setAge(19);
        c.eat();
        c.sayHello();
    }
}
