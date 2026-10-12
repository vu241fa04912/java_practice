public class Swap {
    public static void main(String[] args) {
        int a=20;
        int b=40;
        System.out.println("The values of a and b before Swapping : "+a+" "+b);

        swap(a,b);
        System.out.println("after swapping : "+a+" "+b);

    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        // valid only in this function

        // in primitive data type value is passed 

        // but in  non primitive data type reference and value is passed
        
        

        

    }
    
}
