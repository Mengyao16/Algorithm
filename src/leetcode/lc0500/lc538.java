package Algorithm.leetcode.lc0500;

import Algorithm.structure.TreeNode;

public class lc538 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;

    }
    public void dfs(TreeNode root){
        if(root==null) return ;
        dfs(root.right);
        sum = sum + root.val;
        root.val = sum;
        dfs(root.left);
    }
}
