package Algorithm.nowcoder.top101;

import Algorithm.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BM24 {
    public int[] inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        int len = list.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = list.get(i);
        }

        return res;


    }
    public void inorder(TreeNode root,List<Integer> list){
        if(root==null) return ;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    //非递归版本
    public int[] inorderTraversal2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root!=null){
            stack.push(root) ;
        }
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node!=null){
                if(node.left!=null){
                    stack.push(node.left);
                }
                stack.push(node);
                stack.push(null);
                if(node.right!=null){
                    stack.push(node.right);
                }

            }else{
                list.add(stack.pop().val);
            }

        }
        int len = list.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = list.get(i);
        }
        return res;

    }
}
