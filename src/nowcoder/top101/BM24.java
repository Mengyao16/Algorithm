package Algorithm.nowcoder.top101;

import Algorithm.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
}
