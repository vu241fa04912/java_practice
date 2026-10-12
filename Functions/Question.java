import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n=sc.nextInt();
        // boolean x=isPrime(n);
        // isarmstrong(n);

        is3arm();
        // if (x){
        //     System.out.println("it is prime");
        // }
        // else System.out.println("not a prime");
        sc.close();
    }
    // Prime or not 
    static boolean isPrime(int n){

        if (n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if (n%c==0){
                return false;

            }
            c++;
            
        }
        return c*c>n;

    }

    // all the 3 digit Armstrong numbers

    static boolean isarmstrong(int n){

        int dup=n;
        int sum=0;
        while(n>0){

            int rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;

        }
        // if (dup==sum) System.out.println("It is armstrong");
        // else System.out.println("not an armstrong");
        return dup==sum;

    }
    static void is3arm(){
        System.out.println("The three digit armstrong number are : ");
        for(int i=100;i<1000;i++){
            if (isarmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }





    
}
