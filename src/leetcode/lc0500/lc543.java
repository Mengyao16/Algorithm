package Algorithm.leetcode.lc0500;

import Algorithm.structure.TreeNode;

public class lc543 {

    //二叉树的直径
    //思路：递归，左子树+右子树的最大深度
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int right = dfs(root.right ) +1;
        int left = dfs(root.left) +1;
        res = Math.max(res,left + right -2);
        return Math.max(right ,left);
    }
}
