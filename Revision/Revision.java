public class Revision {

    public static void main(String[] args) {
        int[] arr = {1, 3, -4, 7, 5, -2, 4, -2, 234, -24};
        int pos_counter=0;
        int neg_counter=0;
        for (int i =0 ; i < arr.length ; i++){
            if (arr[i] >=0){
                pos_counter+=1;
            }else{
                neg_counter+=1;
            }
        }

        System.out.println("Positive numbers Count:"+pos_counter);
        System.out.println("Negative numbers Count:"+neg_counter);


        //Reverse of a number

        int Number=123456;
        int DumNumber = Number;
        int ReverseNumber=0;

        while(DumNumber!=0){
            int digit = DumNumber % 10;
            ReverseNumber = ReverseNumber * 10 + digit;
            DumNumber = DumNumber /10;
        }
        System.out.println("-----------------------------_-----------------------");
        System.out.println("Number "+Number);
        System.out.println("Reverse Number :"+ReverseNumber);


    }

}
