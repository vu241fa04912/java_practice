public class Ceiling_a_number{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=10;
        int res=ceiling(arr,target);
        System.out.println(res);
    }
    public static int ceiling(int[] arr,int target){
        int st=0;
        int ed=arr.length-1;
        
        while(st<=ed){
            int mid=st+(ed-st)/2;
            if(arr[mid]==target) return target;
            else if(arr[mid]<target) st=mid+1;
            else ed=mid-1;
        }

        return st;
    }
}