import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        // int[] arr = new int[5];
        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;
        // arr[3]=4;
        // arr[4]=5;
        
        // for (int i=0;i<5;i++){
        //     System.out.println(arr[i]);
        // }

        // input()


        // array of objects
        String[] arr= new String[5];
        
        for (int i=0;i<arr.length;i++) arr[i]=in.next();
        for (int i=0;i<arr.length;i++) System.out.println(arr[i]);;
         

        System.out.println("This is for each loop");

        // for each loop
        for (String j : arr){
            System.out.println(j);
        }

        // direct method to print array
        System.out.println(" ");
        System.out.println(Arrays.toString(arr));




        in.close();
    }
    
    
}
