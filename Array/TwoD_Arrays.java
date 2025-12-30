package Array;


public class TwoD_Arrays {
    public static void main(String[] args){

        int[][] nums={
                {11,12,13,30},
                {14,15,16,20},
                {17,18,19,40},
                {21,22,23,24},
        };

        System.out.println("2D Arrays");
        System.out.println("------------------------------------");
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }

//Jagged Array
        System.out.println();
        System.out.println("Jagged Array");
        char[][] arr = new char[3][]; // we don't tell , how many cols we want
        arr[0]=new char[2]; // here we explicitly tell the cols
        arr[1] = new char[3]; // here we create a jagged row
        arr[2]=new char[2];
        arr[0][0]='H';
        arr[0][1]='e';
        arr[1][0]='l';
        arr[1][1]='l';
        arr[1][2]='T';
        arr[2][0]='o';
        arr[2][1]='!';
        System.out.println("------------------------------------");
        for(int i = 0 ; i < arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
