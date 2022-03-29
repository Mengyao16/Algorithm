package Algorithm.nowcoder.top101;
import Algorithm.structure.TreeNode;
public class BM28 {
    //二叉树的最大深度
    public static int maxDepth (TreeNode root){
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

}
