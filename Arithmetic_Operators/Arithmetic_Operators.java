public class Arithmetic_Operators {

    public static void main(String[] args)
    {
        double a= 10;/*this and b could have been int but we are doing operation with c which must be a double*/
        double b = 20;
        double c = 7.1;

        System.out.println(a + b + c);

        System.out.println(a - b - c );

        System.out.println(a * b * c);

        System.out.println(a / b / c);

        System.out.println(a % b % c);
        double i = a/ c * b;  //in this equation the / and * are of same precedence , hence it will follow left to right
        System.out.println(i);

        //Compound operator +=
        System.out.println(a+=5);
        System.out.println(a-=5);
        System.out.println(a*=5);
    }
}
