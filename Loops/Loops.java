public class Loops {
    public static void main(String[] args){
        int i=0;
        //Odd numbers
        for(i=1 ; i<11 ; i+=2){
            System.out.println(i);
        }
        i=0;
        //Even numbers
        System.out.println("------------------------------------");
        while(i<11){
            System.out.println(i);
            i+=2;
        }
        i=0;
        //counting
        System.out.println("------------------------------------");
        do{
            System.out.println(i);
            i+=1;
        }while(i<11);

    }
}
