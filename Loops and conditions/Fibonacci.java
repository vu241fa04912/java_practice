import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        long a=0L,b=1L;
        long n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextLong();
        System.out.print(a+" ");
        System.out.print(b+" ");
        long i=2L;
        while (i<=n){
            i+=1;
            long c=a+b;

            System.out.print(c+" ");
            a=b;
            b=c;

        }

        sc.close();
        
    }
}