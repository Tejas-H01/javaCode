public class Bitwise {
    public static void main(String[] args) {

        int a =5 ;
        System.out.println("Binary format of a: "+Integer.toBinaryString(a)+"\tWhere a: "+a);
        int b = 4;
        System.out.println("Binary format of b: "+Integer.toBinaryString(b)+"\tWhere a: "+b);

        System.out.println();
        //AND
        int and = a & b;
        System.out.println("AND(&) of a b: "+ and);
        System.out.println("Binary format of a AND b: "+Integer.toBinaryString(and));
        System.out.println();
        //OR
        int or = a | b;
        System.out.println("OR(|) of a b: "+ or);
        System.out.println("Binary format of a OR b: "+Integer.toBinaryString(or));
        System.out.println();
        //XOR
        int xor = a ^ b;
        System.out.println("XOR(^) of a b: "+ xor);
        System.out.println("Binary format of a XOR b: "+Integer.toBinaryString(xor));
        System.out.println();
        //NOT
        int not = ~a;
        System.out.println("NOT(~a) of a : "+ not);
        System.out.println("Binary format of NOT a: "+Integer.toBinaryString(not));

    }
}
