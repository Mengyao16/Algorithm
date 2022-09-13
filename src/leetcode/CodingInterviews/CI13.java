package Algorithm.leetcode.CodingInterviews;

public class CI13 {
    int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};

    int m ;
    int n ;

    public static void main(String[] args) {
        new CI13().movingCount(1,2,1);
    }

    public int movingCount(int m ,int n ,int k){
        this.m = m;
        this.n = n;
        boolean[][] visited = new boolean[m][n];

        dfs(0,0,visited,k);
        int res = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(visited[i][j]){
                    res++;
                }
            }
        }
        return res;
    }
    private void dfs(int i,int j,boolean[][] visited,int k){
        if(i<0||i>=m||j<0||j>=n){
            return ;
        }
        int sum = i%10 + i%100/10 +i%1000/100 + j%10 + j%100/10 +j%1000/100;
        if(sum>k){
            return ;
        }
        if(visited[i][j]){
            return ;
        }
        visited[i][j] = true;
        for (int[] dir:
                dirs) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            dfs(newI,newJ,visited,k);
        }

    }
}
