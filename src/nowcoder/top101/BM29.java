package Algorithm.nowcoder.top101;
import Algorithm.structure.TreeNode;

public class BM29 {
    //二叉树中和为某一值的路径
    public boolean hasPathSum(TreeNode root,int sum){
        if(root==null) return false;
        if(root.left ==null && root.right==null && root.val == sum){
            return true;
        }

        return hasPathSum(root.left,sum-root.val)|| hasPathSum(root.right,sum-root.val);
    }
}
