package Algorithm.exam.tme;

import Algorithm.structure.TreeNode;

import java.util.ArrayList;

public class Main5 {
    public ArrayList<TreeNode> getBinaryTrees (ArrayList<Integer> preOrder, ArrayList<Integer> inOrder) {
        // write code here
        //给出先序和中序，还原所有可能的二叉树

        return buildTree(preOrder,0,preOrder.size()-1,inOrder,0,inOrder.size()-1);

    }
    public ArrayList<TreeNode> buildTree(ArrayList<Integer> preOrder,int preStart,int preEnd,ArrayList<Integer> inOrder,int inStart,int inEnd){
        ArrayList<TreeNode> res = new ArrayList<>();
        if(preStart>preEnd||inStart>inEnd){
            res.add(null);
            return res;
        }
        int rootVal = preOrder.get(preStart);
        ArrayList<Integer> indexs  = new ArrayList<>();
        for (int i = inStart; i <= inEnd; i++) {
            if(inOrder.get(i)==rootVal){
                indexs.add(i);
            }

        }
        for(Integer index:indexs){
            ArrayList<TreeNode> lefts = buildTree(preOrder,preStart+1,preStart-inStart+index,inOrder,inStart,index-1);
            ArrayList<TreeNode> rights = buildTree(preOrder,preStart-inStart+index+1,preEnd,inOrder,index+1,inEnd);

            for (TreeNode left : lefts) {
                for (TreeNode right : rights) {
                    TreeNode root = new TreeNode(rootVal);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;


    }
}
