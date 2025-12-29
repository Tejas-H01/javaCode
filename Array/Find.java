package Array;

public class Find {

    public static void main(String[] args) {
        int arr1[] = {12, 23, 21, 43, 56, 34, 65, 45, 78};
        int i;
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] == 56) {
                break;
            }
        }
        for(int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j] + " ->"+(j +1));
        }
        System.out.println("------------------------------------");

        int position = i+1;
        System.out.println("Postion: "+position);
    }
}
