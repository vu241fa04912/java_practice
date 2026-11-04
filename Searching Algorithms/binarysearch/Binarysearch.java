import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in an array:");
        int n=sc.nextInt(); 
        System.out.println("enter the elements in \n sorting order only:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key element:");
        int key=sc.nextInt();
        int res=ordAgnosticBS(arr, key);
        if(res==-1) System.out.println("element not found");
        else System.out.println("element found at : "+res);
        sc.close();
    }
    static int binary(int[] arr,int low,int high,int key){

        if(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if (arr[mid]<key){   // search right
                return binary(arr, mid+1, high, key);
            }
            else{
                return binary(arr, low, mid-1, key);
            }

        }
        return -1;
    }
    static int ordAgnosticBS(int[] arr,int key){
        int st=0;
        int end=arr.length-1;


        boolean isAsc= arr[end]>arr[st];
        while(st<=end){
            int m=st+(end - st)/2;
            
            if (arr[m]==key) return m;
            else if (arr[m]<key) {
                
                if(isAsc) st=m+1;
                else end=m-1;
            }
            else {
                if(isAsc) end=m-1;
                else st=m+1;

        }
    }




        return -1;
}
    
    
}
