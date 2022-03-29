package Algorithm.nowcoder.top101;

import Algorithm.structure.TreeNode;

public class BM34 {
    //中序遍历是一个递增数列
    long pre  = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root){
        return inorder(root);
    }
    public boolean inorder(TreeNode root){
        if(root == null ) return true;
        boolean l = inorder(root.left);
        if(root.val<=pre) return false;
        pre = root.val;
        boolean r = inorder(root.right);
        return l&&r;

    }

}
