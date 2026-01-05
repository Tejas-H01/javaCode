package OOP_codes.Inheritance.Animal;

public class T {

    public static void main(String[] args){
        dog d = new dog();
        String name = d.setName("Bob");
        System.out.println("------------------------------------------------");
        System.out.println("Name: "+name);
        d.eat();
        d.sayHello();

        System.out.println("");
        cat c = new cat();
        System.out.println("------------------------------------------------");
        String catname=c.setName("Manya");
        System.out.println("Cat name: "+ catname);
        c.eat();
        c.sayHello();
    }
}
