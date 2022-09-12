package Algorithm.leetcode.Allproblems;

class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;


    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
public class lc427ConstructQuadTree {
    public Node construct (int[][] grid){
        return dfs(grid,grid.length,grid.length,0,0);
    }
    public Node dfs(int[][] grid ,int len1,int len2,int i,int j){
        boolean same = true;
        for (int k = 0; k < len1; k++) {
            for (int l = 0; l < len2; l++) {
                if(grid[i+k][j+l]!=grid[i][j]){
                    same = false;
                    break;
                }

            }
            if(!same) break;
        }

        if(same){
            return new Node(grid[i][j]==1,true);
        }
        Node ret = new Node(
                true,
                false,
                dfs(grid,len1/2,len2/2,i,j),

                dfs(grid,len1/2,len2/2,i,j+len2/2),
                dfs(grid,len1/2,len2/2,i+len1/2,j),
                dfs(grid,len1/2,len2/2,i+len1/2,j+len2/2)
        );
        return ret;

    }


}
