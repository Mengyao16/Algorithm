package Algorithm.nowcoder.top101;

import Algorithm.structure.TreeNode;

public class BM32 {
    public static TreeNode mergeTrees(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return null;
        if(root1!=null && root2!=null){
            root1.val = root1.val + root2.val;
            root1.left = mergeTrees(root1.left,root2.left);
            root1.right = mergeTrees(root1.right,root2.right);
        }else if(root1!=null && root2==null){
            return root1;
        }else if(root1==null && root2!=null){
            return root2;
        }
        return root1;
    }

}
