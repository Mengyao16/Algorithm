package Algorithm.nowcoder.top101;

import Algorithm.structure.TreeNode;

public class BM37 {
    //二叉树的最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){

        if(root.val==p.val||root.val==q.val||(p.val<root.val&&q.val>root.val)||(p.val>root.val&&q.val<root.val)){
            return root;
        }
        if(p.val<root.val&&q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val>root.val&&q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return null;



    }


}
