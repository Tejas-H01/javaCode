package ExceptionHandling;

public class ArithmeticEx {
    public static void main(String[] args){

        int[] Numerators = {12,34,32,36};
        int[]  Denomenator ={1,2,0,3};

        for(int i = 0 ; i < Numerators.length ; i++){
            System.out.println(divide(Numerators[i],Denomenator[i]));
        }
        System.out.println("Divided Every Number");


    }
    public static int divide(int a , int b){
    return a/b;
    }

}
