import java.util.Scanner;



public class TypeCasting {
    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        // float f=input.nextFloat();
        // int f=input.nextInt();
        // System.out.println(f);


        // type casting
        // int num=(int)(67.56f);
        // System.out.println(num);


        // automatic type promotion in expressions
        // int a=257;
        // byte b=(byte)(a);
        // System.out.println(b); // --> 257 % 256==1


        // byte a=50;
        // byte b=40;
        // byte c=100;
        // int d=(a*b)/c;

        // System.out.println(a*b/c);

        // byte b=50;
        // b=(byte)(b*2);


        // int num='a';
    
        // System.out.println("నమసకారం"); // java follows unicode princiciple

        // String n="a";
        // System.out.println((float)9/5);
        float f=4.55f;
        int n=(int)f;

        System.out.println(n);

        input.close();

    }
    
}
