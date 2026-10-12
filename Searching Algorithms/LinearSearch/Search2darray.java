// import java.util.Arrays;

public class Search2darray {
    public static void main(String[] args) {
        int[][] arr={
            {23,4,12},
            {33,22,11},
            {12,24,36}
        };
        int t=33;
        System.out.println(find_max(arr,t));
    }
    

    static int[] find(int[][] arr,int key){
        for (int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if (arr[row][col]==key){
                    // max=arr[row][col];

                return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
        // return max;
    }
    // ! for finding max value
    static int find_max(int[][] arr,int key){
        int max=Integer.MIN_VALUE;
       for(int[] i:arr){
        for(int x:i){
            if(x>max) max=x;
        }
       }
        // return new int[]{-1,-1};
        return max;
    }
}
