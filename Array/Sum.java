package Array;

public class Sum {
    public static void main(String[] args) {
        int arr1[] = {12, 23, 21, 43, 56, 34, 65, 45, 78};
        int sum=0;
        for(int i=0 ; i < arr1.length;i++){
            sum+=arr1[i];
        }
        System.out.println("------------------------------------");
        System.out.println("Sum: "+sum);
    }
}
