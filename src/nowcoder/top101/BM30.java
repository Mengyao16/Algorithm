package Algorithm.nowcoder.top101;
import Algorithm.structure.TreeNode;
import java.util.LinkedList;

public class BM30 {
    //二叉搜索树与双向链表
    //中序遍历，改变指向
    TreeNode pre =null,head =null;
    public TreeNode treeToDoublyList(TreeNode root){
        if(root==null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;


    }
    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        if(pre!=null) pre.right = root;
        else head =root;
        root.left = pre;
        pre = root;
        dfs(root.right);
    }



}
