package Algorithm.nowcoder.top101;

public class BM57 {
    int count  = 0;
    public int solve(char[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j]=='1'){
                    traceback(grid,i,j);
                    count++;
                }

            }
        }
        return count;
    }
    public void traceback(char[][] grid,int i,int j){
        grid[i][j] = '0';
        if(i-1>=0&&grid[i-1][j]=='1'){
            traceback( grid,i-1, j);
        }
        if(j-1>=0&&grid[i][j-1]=='1'){
            traceback( grid,i, j-1);
        }
        if(i+1<grid.length&&grid[i+1][j]=='1'){
            traceback( grid,i+1, j);
        }
        if(j+1<grid[0].length&&grid[i][j+1]=='1'){
            traceback( grid,i, j=1);
        }
    }
}
