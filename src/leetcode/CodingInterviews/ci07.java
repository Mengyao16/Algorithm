package Algorithm.leetcode.CodingInterviews;

import Algorithm.structure.TreeNode;

import java.util.HashMap;

public class ci07 {
    HashMap<Integer,Integer> map = new HashMap<>();
    int[] preorder ;
    public TreeNode buildTree(int[] preorder,int[] inorder){
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        TreeNode head = build(0,preorder.length-1,0,inorder.length-1);

        return head;

    }
    public TreeNode build(int preLeft,int preRight ,int inLeft ,int inRight){
        if(preLeft>preRight){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preLeft]);
        int index = map.get(preorder[preLeft]);
        int leftTreeLong = index - inLeft;
        int rightTreeLong = inRight - index;

        root.left = build(preLeft+1,preLeft+leftTreeLong,inLeft,index-1);
        root.right = build(preLeft+leftTreeLong+1,preRight,index+1,inRight);

        return root;


    }
}
