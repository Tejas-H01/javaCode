package Array;

public class Max   {
    public static void main(String[] args) {
        int arr[]={-12,-3223,-34325,-2321,-463,-1232 };

        int max=Integer.MIN_VALUE; // this is the negative infinity value basically , the lowest value of all always

        for(int i =0 ; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("------------------------------------");
        System.out.println("Max value: "+max);
    }
}
