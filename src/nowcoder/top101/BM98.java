package Algorithm.nowcoder.top101;

import java.util.ArrayList;
import java.util.List;

public class BM98 {
    //螺旋矩阵
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(arr).toArray().toString());
    }
    static List<Integer> res = new ArrayList<>();
    public static List<Integer> spiralOrder(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        while(m>=1&&n>=1){
            circle(matrix,m,n);
            m = m - 2;
            n = n - 2;
        }
        return res;
    }
    public static void circle(int[][] matrix,int m,int n){
        int start = (matrix.length - n)/2;
        for (int i = 0; i < m ; i++) {
            res.add(matrix[start][start+i]);
        }
        for (int i = 0; i < n -1; i++) {
            res.add(matrix[start+i+1][start+m-1]);
        }
        for (int i = 0; i < m -1&&n!=1; i++) {
            res.add(matrix[start+n-1][start+m-2-i]);
        }
        for (int i = 0; i < n -2&&m!=1; i++) {
            res.add(matrix[start+n-2-i][start]);
        }
    }


}
