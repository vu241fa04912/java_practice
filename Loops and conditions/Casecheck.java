import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        char a=in.next().trim().charAt(0);

        if (a<'A' || a>'z'){
            System.out.println("it is not a alphabet");
        }
        else if (a>='A' && a<='Z'){
            System.out.println("Upper case letter");
        }
        else{
            System.out.println("lower case letteer");
        }





        in.close();


    }
    
}
