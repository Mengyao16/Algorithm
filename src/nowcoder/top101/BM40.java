package Algorithm.nowcoder.top101;
import Algorithm.structure.TreeNode;

import java.util.HashMap;

public class BM40 {
    //重建二叉树
    //输入前序和中序遍历的结果，构建该二叉树并返回节点
    //假设不含重复数字
    int[] preorder;
    HashMap<Integer,Integer> map = new HashMap();
    public TreeNode buildTree(int[] preorder,int[] inorder){
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(i,inorder[i]);
        }

        return build(0,0,inorder.length);
    }
    public TreeNode build(int root,int l,int r){
        if(l>=r) return null;
        TreeNode node = new TreeNode(preorder[root]);
        int i = map.get(preorder[root]);//获得root在中序遍历的i位置
        node.left = build( root+1, l, i-1);
        node.right = build( root-l+i+1, i+1, r);
        return node;

    }


}
