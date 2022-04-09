package Algorithm.nowcoder.top101;
import Algorithm.structure.TreeNode;

public class BM36 {
    //判断是不是平衡二叉树
    public boolean IsBalanced_Solution(TreeNode root){
        return depth(root)!=-1;

    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        int leftHeight = depth(root.left);
        int rightHeight = depth(root.right);
        if(rightHeight==-1||leftHeight==-1||Math.abs((leftHeight-rightHeight))>1){
            return -1;
        }
        return Math.max(leftHeight,rightHeight) +1 ;

    }
}
