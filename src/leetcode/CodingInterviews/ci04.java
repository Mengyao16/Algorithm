package Algorithm.leetcode.CodingInterviews;

public class ci04 {
    //二维数组中的查找
    public boolean findNumberIn2DArray(int[][] matrix ,int target){
        int m = matrix.length-1;
        int n = 0;
        while(m>=0&&n< matrix[0].length){
            if(matrix[m][n]==target){
                return true;
            }else if(matrix[m][n]>target){
                m--;

            }else{
                n++;
            }
        }
        return false;
    }
}
