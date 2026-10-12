import java.util.Arrays;

public class SearchString{
    public static void main(String[] args) {
        
        String[] s={"bunny"};
        System.out.println(Arrays.toString(s));
        // if (find(s,'q')){
        //     System.out.println("element is there");
        // }
        // else{
        //     System.out.println("element not found");
        // }
    }

    static boolean find(String str,char target){
        if (str.length()==0){   // length is function in string class 
            // but arr.length doesnt have () bcoz lenght is variable
            return false;

        }
        // for loop

        // for (int i=0;i<str.length();i++){
        //     if (str.charAt(i)==target){
        //         return true;
        //     }

        // }




        // ! ===== for each loop ====

        for(char ch:str.toCharArray()){
            if (ch==target) return true;
        }




        return false;
        


    }
}