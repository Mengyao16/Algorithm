package Algorithm.exam.tme;

import Algorithm.structure.TreeNode;

public class Main6 {

    public int getTreeSum (TreeNode tree) {
        // write code here
        int depth = dfs(tree);
        int sum = 0;
        for(int i  = 0;i<depth;i++){
            sum = (sum + (int)Math.pow(2,i) % 1000000007) % 1000000007;
        }
        return sum;

    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(dfs(root.right),dfs(root.left)) +1;
    }
}
