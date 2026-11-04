public class Binarysearch_2Darray {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{8,27,99}};
        int[] res=search(mat, 100);
        for(int row:res){
            System.out.println(row);
        }
    }
    static int[] search (int[][] matrix,int target){
        int row=0;
        int col=matrix[0].length-1;
        while (row<matrix.length && col>=0){
            if(matrix[row][col]==target) return new int[]{row,col};
            else if(matrix[row][col]<target) row++;
            else col--;
        }
        return new int[]{-1,-1};
    }
}
