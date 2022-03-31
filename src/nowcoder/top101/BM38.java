package Algorithm.nowcoder.top101;
import Algorithm.structure.TreeNode;

public class BM38 {
    //在二叉树中找到两个节点的最近公共祖先
    public TreeNode lowestCommonAncestor (TreeNode root, TreeNode p, TreeNode q){
        if(root==null||root.val ==p.val||root.val==q.val)
            return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null) return root;
        if(left==null) return right;
        if(right==null) return left;
        return root;

    }
}
