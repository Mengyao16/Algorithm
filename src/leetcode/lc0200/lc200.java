package Algorithm.leetcode.lc0200;

public class lc200 {
    public int numIslands(char[][] grid){
        //1表示陆地，0表示水
        int ans  = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(grid,i,j);
                }
            }

        }

        return ans;
    }
    int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public void dfs(char[][] grid ,int i,int j){
        if(grid[i][j]=='2') return ;
        if(grid[i][j]=='0') return ;
        grid[i][j] = '2';
        for (int[] dir : directions){
            int newi = i+ dir[0];
            int newj = j + dir[1];
            if(newi>=0&&newj>=0&&newi< grid.length&&newj< grid[0].length){
                dfs(grid,newi,newj);
            }
        }


    }
}
