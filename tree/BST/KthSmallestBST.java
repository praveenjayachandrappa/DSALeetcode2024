package tree.BST;

import tree.TreeNode;

public class KthSmallestBST {

    int kthValue=-1;
    static int count=0;

    public int kthSmallest(TreeNode root, int k) {

        traverseInorderBST(root,k);

        return kthValue;
    }


    private void traverseInorderBST(TreeNode root,int k){

        if(root==null) return;

        traverseInorderBST(root.left,k);

        count+=1;

        if(count==k) {
            kthValue=root.val;
        }

        traverseInorderBST(root.right,k);
    }


    //     public int kthSmallest(TreeNode root, int k) {

//         List<Integer> inorder=new ArrayList();

//         inOrderBST(root,inorder);

//      //   System.out.println(inorder);

//         return inorder.get(k-1);
//     }

//     private void inOrderBST(TreeNode root,List<Integer> inorder){

//         if(root==null) return;

//         inOrderBST(root.left,inorder);

//         inorder.add(root.val);

//         inOrderBST(root.right,inorder);

//     }

}
