public class Minnumber {
    public static void main(String[] args) {
        int[] arr={2,3,6,-7};
        System.out.println(min(arr));
        
    }


    // assume length of an array is not null
    // ! return the minimum value
    static int  min(int[] arr){
        int m=arr[0];
        for (int i:arr){
            if (i<m){
                m=i;
            }
        }
        return m;

    }
    
}
