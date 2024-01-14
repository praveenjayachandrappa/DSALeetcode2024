package tree.BST;

import com.sun.source.tree.Tree;
import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

    private TreeNode root;

    public BinarySearchTree(){
        this.root=null;
    }

    public TreeNode createBinarySearchTree(int[] A){

      //  root=new TreeNode(A[0]);
        TreeNode root=null;
        for (int i = 0; i <A.length ; i++) {
            //insertBST(root,A[i]);
            root=insertBSTRecursive(root,A[i]);
        }

        return root;
    }


    //inorder traversal of BST gives the sorted order

    public void printInorder(TreeNode root){

        if(root==null) return;

        printInorder(root.left);

        System.out.print(root.val+",");
        printInorder(root.right);
    }


    private void insertBST(TreeNode root,int key){
//O(logN)
        TreeNode ptr=root;
        TreeNode tail=null;

        while (ptr!=null){
            tail=ptr;
            if(key==root.val)
                return;
            if(key<ptr.val){
                ptr=ptr.left;
            }
            else{
                ptr=ptr.right;
            }
        }

        if(key < tail.val){
            tail.left=new TreeNode(key);
        }
        else{

            tail.right=new TreeNode(key);
        }

    }


    public TreeNode insertBSTRecursive(TreeNode root,int key){

        if(root==null){
            root=new TreeNode(key);
            return root;
        }

        if(key < root.val){

            root.left=insertBSTRecursive(root.left,key);
        }
        else{

            root.right=insertBSTRecursive(root.right,key);
        }

        return root;
    }

    List<Integer> nodeValues=new ArrayList<>();


    private void inorderBST(TreeNode root){

        if(root==null) return;

        inorderBST(root.left);
        nodeValues.add(root.val);
        inorderBST(root.right);
    }


    public int getMinimumDifference(TreeNode root) {

        inorderBST(root);

        int min=Integer.MAX_VALUE;

        for (int i = 1; i <nodeValues.size() ; i++) {

            min=Math.min(min,nodeValues.get(i)-nodeValues.get(i-1));
        }

        return min;
    }

    public static void main(String[] args) {


        int[] A={40,30,50,10,35,45,60};

        BinarySearchTree bst=new BinarySearchTree();

        TreeNode root = bst.createBinarySearchTree(A);

       // bst.printInorder(root);
//
//       // bst.printInorder(root);
//
        bst.insertBST(root,48);
        bst.insertBST(root,9);
        bst.printInorder(root);

        KthSmallestBST kthSmallestBST=new KthSmallestBST();

        System.out.println();
        int kthSmallest = kthSmallestBST.kthSmallest(root, 10);

        System.out.println(kthSmallest);

    }
}
