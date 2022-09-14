package Algorithm.leetcode.lc0200;

import Algorithm.structure.TreeNode;

public class lc226 {
    //翻转二叉树
    public TreeNode invertTree(TreeNode root) {

        if(root==null){
            return  root;
        }
        TreeNode node = invertTree(root.left);
        root.left  = invertTree(root.right);
        root.right = node;
        return root;
    }
}
