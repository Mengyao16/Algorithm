package Algorithm.leetcode.lc0200;

import Algorithm.structure.TreeNode;

public class lc236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null||p==root || q ==root) return root;
        TreeNode left = lowestCommonAncestor(root.left ,p,q);
        TreeNode right = lowestCommonAncestor(root.right ,p,q);
        if(left !=null && right !=null) return root;
        if(left==null) return right ;
        if(right ==null) return left;
        return null;
    }
}
