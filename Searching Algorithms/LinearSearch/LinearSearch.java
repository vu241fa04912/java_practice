import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array : ");

        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements in the array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key element : ");
        int key=sc.nextInt();
        int pos=linear(arr,key);
        if (pos==-1){
            System.out.println("Oops! element is not found");

        }
        else{
            System.out.println("Element found at : "+(pos+1)+" index position");
        }



        sc.close();
        
    }

    static int linear(int[] arr,int key){

        
        for (int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
                
            }
            
        }
        return -1;



    }
}