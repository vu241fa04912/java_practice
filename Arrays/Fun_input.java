import java.util.Arrays;
import java.util.Scanner;

public class Fun_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // mutable
        int[] arr=new int[5];

        System.out.println("int the main function the array values:");
        for(int i:arr){
            System.out.println(i);
        }
        take(arr);

        System.out.println("after calling the function");

        System.out.println(Arrays.toString(arr));

        in.close();

    }

    static void take(int[] arr){
        arr[2]=3;

    }


    
}
