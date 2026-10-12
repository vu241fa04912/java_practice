import java.util.Arrays;
import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1,2,3,4};

        rev(arr);



        System.out.println(Arrays.toString(arr));

        in.close();

    }
    static void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;


    }
    // Maximum in an array
    static int maxim(int[] arr){

        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static void rev(int[] arr){
        int st=0;
        int lt=arr.length - 1;
        while(st<lt){
            swap(arr,st,lt);
            st++;
            lt--;
        }
    }
    
}
