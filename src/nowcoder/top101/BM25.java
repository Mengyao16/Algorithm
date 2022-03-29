package Algorithm.nowcoder.top101;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import Algorithm.structure.TreeNode;

public class BM25 {
    //中序遍历
    public static List<Integer>  postorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        postorder(root,res);
        return res;

    }
    public static void postorder(TreeNode root,List<Integer> res){
        if(root == null) return ;
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
    }
    public static List<Integer>  postorderTraversal2(TreeNode root){

        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root!=null){
            stack.add(root);
        }
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node!=null){
                stack.push(node);
                stack.push(null);

                if(node.right!=null){
                    stack.push(node.right);
                }
                if(node.left!=null){
                    stack.push(node.left);
                }
            }
            else {
                res.add(stack.pop().val);
            }



        }
        return res;
    }

}
