public class Increment_Decrement {
    public static void main(String[] args) {
        //increment
        //post
        int a = 99;
        System.out.println("a: "+a);
        int postI = a++;
        System.out.println("Post increment of a: "+postI);
        //pre
        int preI = ++a;
        System.out.println("Pre increment of a: "+preI);

        //decrement
        //post
        int postD = a--;
        System.out.println("Post decrement of a: "+postD);
        //pre
        int preD = --a;
        System.out.println("Pre decrement of a: "+preD);

        int b = 99;
        int mix = b++ + b;
        // First operand (b++) uses the current value of b (e.g., 99), then increments b
        // Second operand (b) uses the incremented value (100)

        // Result: 99 + 100 = 199
        System.out.println("b: "+b);
        System.out.println("b++ + b: "+mix);

        int c = 1;
        int mix1= ++c + --c;
        // 2 + 1
        int mix2 = c-- + ++c;
        // 1 + 2
        System.out.println("c: "+c);
        System.out.println("++c + --c"+mix1);
        System.out.println("c-- + ++c: "+mix2);

    }
}
