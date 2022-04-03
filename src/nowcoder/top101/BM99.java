package Algorithm.nowcoder.top101;

public class BM99 {
    //旋转矩阵
    //leetcode48 旋转图像
    public void rotate(int[][] matrix){
        //先上下反转
        //再沿对角线反转
        int len = matrix.length;
        for (int i = 0; i < len/2; i++) {
            for (int j = 0; j < len; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[len-1-i][j];
                matrix[len-1-i][j] = tmp;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

    }
}
