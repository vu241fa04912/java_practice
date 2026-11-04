class Selectionsort{
    public static void main(String[] args){
        int[] arr={44,66,1,4444,76,35};
        selectionsort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
    public static void selectionsort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            int last=n-i-1;
            int ind=max(arr,last);
            swap(arr, ind, last);


        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
    public static int max(int[] arr,int end){
        int temp=0;
        for(int i=1;i<=end;i++){
            if (arr[i]>arr[temp]) temp=i;
        }

        return temp;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}