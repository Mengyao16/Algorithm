package Algorithm.nowcoder.top101;

import Algorithm.structure.TreeNode;
import java.util.LinkedList;

public class BM35 {

    //层序遍历
    public boolean isCompleteTree(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<>();
        if(root==null) return false;
        boolean flag = false;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node == null){
               flag=true;
               continue;
            }
            if(flag) return false;
            queue.offer(node.left);
            queue.offer(node.right);

        }
        return true;



    }
}
