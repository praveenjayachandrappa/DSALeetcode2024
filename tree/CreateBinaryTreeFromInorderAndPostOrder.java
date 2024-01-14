package tree;

import java.util.HashMap;

public class CreateBinaryTreeFromInorderAndPostOrder {

    private HashMap<Integer,Integer> map;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        map=new HashMap<>();

        for (int i = 0; i <inorder.length ; i++) {

            map.put(inorder[i],i);
        }


       return buildTree(inorder,postorder,0,inorder.length-1,0,postorder.length-1);

    }

    private TreeNode buildTree(int[] inorder,int[] postorder,int inStart,int inEnd,int postStart,int postEnd){

        if(inStart > inEnd || postStart > postEnd) return null;

        TreeNode root=new TreeNode(postorder[postEnd]);

        int inRoot=map.get(root);

        root.left=buildTree(inorder,postorder,inStart,inRoot-1,postStart,postEnd-(inEnd-inRoot)-1);

        root.right=buildTree(inorder,postorder,inRoot+1,inEnd,postEnd-(inEnd-inRoot),postEnd-1);

        return root;
    }

}
