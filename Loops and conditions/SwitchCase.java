import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();

        switch(fruit){
            case "mango":
                System.out.println("Hey you love mangoes me too!");
                break;
            case "apple":
                System.out.println("an apple day keeps a doctor away!!!");
                break;
            case "orange":
                System.out.println("Oranges are in orange color");
                break;
            case "grapes":
                System.out.println("Wow! Grapes are good for health and for me!");
                break;
            default:
                System.out.println("oops! you are not of my taste");

                break;
        }






        sc.close();

    }
}
