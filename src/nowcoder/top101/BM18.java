package Algorithm.nowcoder.top101;

public class BM18 {
    //二维数组中的查找
    public boolean findNumberIn2DArray(int[][] matrix,int target){
        int row = matrix.length-1;
        int col = 0;
        while(row >=0&& col<matrix[0].length){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                row--;
            }else{
                col++;
            }
        }
        return false;
    }
}
