import java.util.Scanner;
class Remo{
    static int my(int x){
        return x*x;
    }
}

class First{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int res=Remo.my(10);
        System.err.println(res);
        sc.close();
    }
    static int mymethod(int x){
        return x*2;
        }
}