public class Shadowing {

    static int x=90; // what if x in declared here !!!!!!
    // x=90; will be shadowed at line 8

    public static void main(String[] args) {
        System.out.println(x);
        int x;// the class variable at line 4 is shadowed by this
        
        x=10;// scope will begin when value is initialized
        
        
        System.out.println(x);

        fun();
    }

    static void fun(){
        System.out.println(x); // prints the value 90
    }
    
}
