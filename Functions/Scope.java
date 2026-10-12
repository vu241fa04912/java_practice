import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a=10;
        // int b=20;
        {
            // int a can't be initialized again in this block
            // but a can be change its value
            // a=90;
            // int c=33;
            // values initialized in this block will remain in this block

            int d=sc.nextInt();
            System.out.println("okay inside d is accesible:"+d);



        }
        // int d=90;
        // System.out.println(d);
        
        int c=99;

        System.out.println(c);
        sc.close();
    }
    
}
