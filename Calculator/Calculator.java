import java.util.Scanner;
public class Calculator {

    public static void main(String[] args){

        int num1 , num2 , choice;


        Scanner sc = new Scanner(System.in);

            System.out.println("Enter the First Number : ");
            num1= sc.nextInt();

            System.out.println("Enter the Second Number : ");
            num2= sc.nextInt();


            System.out.println("Select the operation: \n1.Addtion \n2.Subtraction \n3.Division \n4.Multiplication\n5.Exit");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("_______________________________");
                    System.out.println("Addition : " + num1 + num2);
                    System.out.println("_______________________________");
                    break;
                case 2:
                    System.out.println("_______________________________");
                    System.out.println("Subtraction : " + (num1 - num2));
                    System.out.println("_______________________________");
                    break;
                case 3:
                    System.out.println("_______________________________");
                    System.out.println("Division : " + num1 / num2);
                    System.out.println("_______________________________");
                    break;
                case 4:
                    System.out.println("_______________________________");
                    System.out.println("Multiplication : " + num1 * num2);
                    System.out.println("_______________________________");
                    break;
                case 5:
                    System.out.println("Exiting Calculator");
                    break;
                default:
                    System.out.println("Please select a valid input");
            }

    }
}


