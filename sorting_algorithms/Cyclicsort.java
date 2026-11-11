public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr){
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]-1==i) continue;
        //     else{
        //         while(arr[i]-1!=i){
        //             swap(arr, i, arr[i]-1);
        //         }
        //     }
        // }

        int i=0;
        while(i<arr.length){
            int ind=arr[i]-1;
            if(arr[i]!=arr[ind]){
                swap(arr, i, ind);
            }
            else i+=1;
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
