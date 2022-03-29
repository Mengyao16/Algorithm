package Algorithm.nowcoder.top101;

import Algorithm.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BM23 {
    //二叉树的前序遍历
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;

    }
    public void preorder(TreeNode root,List<Integer> res){
        if(root == null){
            return ;
        }
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }

    public List<Integer> preorderTraversal2(TreeNode root){
        List<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();

        if(root!=null){
            stack.push(root);
        }
        while(!stack.isEmpty()){
            TreeNode pop = stack.pop();
            if(pop!=null){
                if(pop.right != null){
                    stack.push(pop.right);
                }
                if(pop.left != null){
                    stack.push(pop.left);
                }
                stack.push(pop);
                stack.push(null);
            }else{
                res.add(stack.pop().val);
            }
        }
        return res;
    }
}
