package Algorithm.leetcode.Allproblems;
import java.util.List;
import java.util.ArrayList;

public class lc417PacificAtlanticWaterFlow {
    static boolean[][] pacific;
    static boolean[][] atlantic;
    static int[][] dirs = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    static int[][] heights;

    public static void main(String[] args) {
        int[][] height = new int[][] {{1,2,3},{8,9,4},{7,6,5}};
        pacificAtlantic(height);

    }
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        lc417PacificAtlanticWaterFlow.heights = heights;
        int len1 = heights.length;
        int len2 = heights[0].length;
        pacific = new boolean[len1][len2];
        atlantic = new boolean[len1][len2];
        for (int i = 0; i <len2; i++) {
            dfs(0,i,pacific);
        }
        for (int i = 1; i <len1; i++) {
            dfs(i,0,pacific);
        }
        for (int i = 0; i <len2; i++) {
            dfs(len1-1,i,atlantic);
        }
        for (int i = 0; i <len1; i++) {
            dfs(i,len2-1,atlantic);
        }


        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<len1;i++){
            for(int j = 0;j<len2;j++){
                if(pacific[i][j]&&atlantic[i][j]){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(i);
                    ans.add(j);
                    res.add(ans);
                }
            }
        }
        System.out.println(res);
        return res;



    }

    private static void dfs(int row,int col,boolean[][] ocean){
        if(ocean[row][col]){
            return ;
        }
        ocean[row][col] = true;
        for (int[] dir:
             dirs) {
            int newRow = row + dir[0],newCol = col + dir[1];
            if(newRow<ocean.length&&newRow>=0&&newCol>=0&&newCol<ocean[0].length&&heights[row][col]<=heights[newRow][newCol]){
                dfs(newRow,newCol,ocean);
            }

        }
    }



}
