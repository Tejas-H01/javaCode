package Overloading;
import java.util.Scanner;
public class ResultEvaluator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] mark = new int[6];
        int count=0;
        System.out.println("___________________________________________________-");
        System.out.println("Insert -1 to stop entries !");
        for(int i=0 ; i <=5 ; i++){

            System.out.printf("Enter the subject %d's marks :",i+1);
            mark[i]=sc.nextInt();
            count+=1;
            if(mark[i]==-1){
                break;
            }
        }
        count -=1;
        switch(count){
            case 3:
                result(mark[0],mark[1],mark[2]);
                break;

            case 5:
                result(mark[0],mark[1],mark[2],mark[3],mark[4]);
                break;

            default:
                System.out.println("Nah!");
        }

    }

    static void result(int a , int b , int c){
        int total = a+b+c;
        float avg = (total/300f)*100;
        System.out.println("___________________________________________________-");
        System.out.println("Total : "+total);
        System.out.println("Average : "+avg);
    }

    static void result(int a , int b , int c , int d , int e){
        int total = a+b+c+d+e;
        float avg = (total/500f)*100;
        System.out.println("___________________________________________________-");
        System.out.println("Total : "+total);
        System.out.println("Average : "+avg);
    }
}
