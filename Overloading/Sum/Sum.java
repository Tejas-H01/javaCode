package Overloading;

public class Sum {

    public static void main(String[] args){
        System.out.println("___________________________________________________-");
        System.out.println("Sum : "+sum(2,3,4,4,5,3,34));
        System.out.println("___________________________________________________-");
    }

    static int sum(int ...a){
        int sum=0;
        for(int i : a){
            sum+=i;
        }
        return sum;
    }
}
