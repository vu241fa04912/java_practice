import java.util.Scanner;
public class Sum {
    public static void main(String[] args){

        // sum();
        int res=sum3(500,1);
        System.out.println("the result is : "+res);
    }
    static int sum3(int a,int b){
        return a+b;

    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers let say a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        return a+b;
        // System.out.println("The sum of the two numbers is : "+(a+b));

    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers let say a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println("The sum of the two numbers is : "+(a+b));

    }
}
