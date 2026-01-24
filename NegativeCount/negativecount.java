public class negativecount {
    public static void main (String[] args){
        int[]  arr = {2, -6, 4, 8, 1,-9};

        int i =0 ;
        int count=0;
        for (i=0 ; i < arr.length;i++){
            if(arr[i]<0){
                count+=1;
            }
        }
        System.out.println("Negative number count : "+count);
    }
}
