public class Overloading {
    public static void main(String[] args) {
        fun(67);
    }
    static void fun(){
        System.out.println("oh normal function is called");
    }
    static void fun(int n){
        System.out.println("oh it is taking inputs : "+n);
    }
}
// function overloading
