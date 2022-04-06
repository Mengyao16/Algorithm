package Algorithm.nowcoder.top101;

public class BM61 {
    //矩阵最长递增路径
    //leetcode329
    public int longestIncreasingPath(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int maxLength = 0;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxLength = Math.max(dfs(matrix,i,j,dp),maxLength);
            }
        }
        return maxLength;
    }

    public int dfs(int[][] matrix ,int i,int j,int[][] dp){
        int dir1=0, dir2=0, dir3=0,dir4=0;
        if(dp[i][j]==0){
            if(j>0&&matrix[i][j-1]>matrix[i][j]){
                dir1 = dfs(matrix,i,j-1,dp);
            }
            if(i>0&&matrix[i-1][j]>matrix[i][j]){
                dir2 = dfs(matrix,i-1,j,dp);
            }
            if(i< matrix.length-1&&matrix[i+1][j]>matrix[i][j]){
                dir3 = dfs(matrix,i+1,j,dp);
            }
            if(j< matrix[0].length-1&&matrix[i][j+1]>matrix[i][j]){
                dir4 = dfs(matrix,i,j+1,dp);
            }
            dp[i][j] = 1+Math.max(dir1,Math.max(dir2,Math.max(dir3,dir4)));

        }
        return dp[i][j];

    }
}
