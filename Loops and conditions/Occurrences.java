import java.util.Scanner;

public class Occurrences {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int count=0;
        System.out.println("enter the number:");
        int n=sc.nextInt();
        System.out.println("enter the key:");

        int key=sc.nextInt();
        while(n>0){

            int r=n%10;
            if (r==key){
                count++;


            }
            n/=10;


        }
        System.out.println(count);




        sc.close();
    }
}
