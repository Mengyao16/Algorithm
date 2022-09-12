package Algorithm.leetcode.CodingInterviews;

public class ci12 {
    //矩阵中的路径

    int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
    char[][]  board;
    String word;
    public boolean exist(char[][] board,String word){
        this.board = board;
        this.word = word;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(dfs(i,j,0,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int i,int j,int pos,boolean[][] visited){

        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j] != word.charAt(pos)){
            return false;
        }
        if(visited[i][j]){
            return false;
        }
        if(pos == word.length()-1){
            return true;
        }

        visited[i][j] = true;
        for (int[] dir:
             dirs) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            if(dfs(newI,newJ,pos+1,visited)){
                return true;
            }
        }

        visited[i][j] = false;
        return false;
    }
}
