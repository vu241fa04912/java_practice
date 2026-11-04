public class Infinite_array {
    public static void main(String[] args) {
        // ? ======
        // ! Find position of an element in a sorted array of infinite numbers
        int[] arr={1,2,3,4,5,6,7,8};
        int key=6;
        int ans=range(arr,key);
        System.out.println(ans);
    }
    static int range(int[] arr,int key){
        int st=0;
        int ed=1;
    
        
        while(key>arr[ed]){
        
            
            int newst=ed+1;
            ed=ed+(ed-st+1)*2;
            st=newst;
        }
        return binary(arr,st,ed,key);
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
    
}
