public class Floor_of_num {
    public static void main(String[] args) {
        int[] arr={2,3,5,6};
        int tar=7;
        int res=floor(arr,tar);
        System.out.println(res);
    }
    public static int floor(int[] arr,int tar){
        int st=0;
        int ed=arr.length-1;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            if(arr[mid]==tar) return tar;
            else if (arr[mid]<tar) st=mid+1;
            else ed=mid-1;
        }
        return ed;
    }
    
}
