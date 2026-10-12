
import java.util.ArrayList;
import java.util.Scanner;


public class Arraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(64);
        // list.set(0,99);
        // list.add(65);
        // list.remove(1);
        

        // System.out.println(list);


        for(int i=0;i<5;i++){
            list.add(in.nextInt());
            

        }
        System.out.println(list.get(3));
        System.out.println(list);

        System.out.println(list.size());



    in.close();
    }

    
}
