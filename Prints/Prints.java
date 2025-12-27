public class Prints {
    public static void main(String[] args){

        int a = 20;
        float b = 1.7f;
        char c = 'a';
        String str = "Tejas";

        System.out.print("Int : "+a+" Float : "+b+" Char : "+c+" String : "+str+"\n"); //print doesnt provide a new line for further prints
        System.out.println("Int : "+a+" Float : "+b+" Char : "+c+" String : "+str);//println does provide a new line


        System.out.printf("Int : %d Float : %.2f Char : %c  String : %s",a,b,c,str);//the %f give 6 zeros free to control it use %.1f
    }
}
