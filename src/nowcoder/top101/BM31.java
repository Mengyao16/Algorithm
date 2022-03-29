package Algorithm.nowcoder.top101;

import Algorithm.structure.TreeNode;

public class BM31 {

    //对称的二叉树
    public boolean isSymmetric(TreeNode root){
        return dfs(root.left,root.right);

    }
    public boolean dfs(TreeNode left,TreeNode right ){
        if(left==null && right ==null){
            return true;
        }else if(left!=null && right ==null){
            return false;
        }else if(left==null && right !=null){
            return false;
        }else if(left.val == right.val){
            return dfs(left.right,right.left) && dfs(left.left,right.right);
        }else return false;

    }
}
