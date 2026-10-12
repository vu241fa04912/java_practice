import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // if the input is x then stop the program
        while (true){
            System.out.println("Enter the operation that you want to do:");
            char x=sc.next().trim().charAt(0);
            if (x=='x' || x=='X'){
                break;
            }
            else{
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.print("THE answer is: ");
                if (x=='+') System.out.println(a+b);
                else if(x=='-') System.out.println(a-b);
                else if (x=='*') System.out.println(a*b);
                else if (x=='/') System.out.println(a/b);
                else System.out.println("Enter a valid operator ");
            }
        }
        sc.close();
    }
}
