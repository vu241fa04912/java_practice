import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun("hello","world");
        // multiple(2,3,3,4,4,4);
        // demo(8,9);
        demo("dileep","manikanta","yaswanth","reddy");

    }
    static void multiple(int a,int b,int ...v){
        System.out.println(Arrays.toString(v));
    } // variable args must be the last argument in the function


    static void fun(String ...v){  // it will store input in an array
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));

    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
        
    }
    
}
