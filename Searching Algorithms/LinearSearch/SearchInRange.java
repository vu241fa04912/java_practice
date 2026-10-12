public class SearchInRange {
    public static void main(String[] args) {
        String s="bunny";
        if (find(s,'n',2,4)) System.out.println("element is there");
        else System.out.println("not found");

        
    }
    static boolean find(String str,char target,int st,int end){
        if (str.length()==0){   // length is function in string class 
            // but arr.length doesnt have () bcoz lenght is variable
            return false;

        }
        // for loop

        for (int i=st;i<=end;i++){
            if (str.charAt(i)==target){
                return true;
            }

        }





        // ! ===== for each loop ====

        // for(char ch:str.toCharArray()){
        //     if (ch==target) return true;
        // }




        return false;
        


    }
}
