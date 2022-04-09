package Algorithm.nowcoder.top101;
import Algorithm.structure.TreeNode;

import java.util.HashMap;

public class BM40 {
    //重建二叉树
    //输入前序和中序遍历的结果，构建该二叉树并返回节点
    //假设不含重复数字
    int[] preorder;
    int[] inorder;
    HashMap<Integer,Integer> map = new HashMap();
    public TreeNode buildTree(int[] preorder,int[] inorder){
        this.preorder = preorder;
        this.inorder = inorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }

        return build(0,preorder.length,0,inorder.length);
    }
    public TreeNode build(int pstart,int pend,int istart,int iend){
        if(pstart>=pend) return null;
        TreeNode node = new TreeNode(preorder[pstart]);
        int i = map.get(preorder[pstart]);//获得root在中序遍历的i位置
        int leftNum = i-istart;
        node.left = build(pstart+1, pstart+leftNum+1,istart,i);
        node.right = build(pstart+leftNum+1,pend, i+1,iend);
        return node;

    }


}
