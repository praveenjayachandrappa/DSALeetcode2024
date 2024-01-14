package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Tree traversals using iterative way
public class TreeTraversals {


    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res=new ArrayList<>();

        if(root==null) return res;

        Stack<TreeNode> stack=new Stack<>();
        TreeNode t=root;

        while (t != null || !stack.isEmpty()) {

            if (t != null) {
                res.add(t.val);
                stack.push(t);
                t = t.left;
            } else {
                t = stack.pop();
                t = t.right;
            }

        }

        return res;

    }


    public List<Integer> inorderTraversal(TreeNode root) {


        List<Integer> res=new ArrayList<>();

        if(root==null) return res;

        Stack<TreeNode> stack=new Stack<>();
        TreeNode t=root;

        while (t != null || !stack.isEmpty()) {

            //left,root,right

            if(t!=null){
                stack.push(t);
                t=t.left;
            }
            else{
                t=stack.pop();
                res.add(t.val);
                t=t.right;
            }
        }

        return res;

    }

    Stack<TreeNode> stack1;
    Stack<TreeNode> stack2;


    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> res=new ArrayList<>();

        if(root==null) return res;

        // Create two stacks
        stack1 = new Stack<>();
        stack2 = new Stack<>();

        if (root == null)
            return res;

        // start from root node and push it to stack1
        stack1.push(root);

        // repeat untill first stack is not empty
        while (!stack1.isEmpty()) {
            // pop node from stack1 and push to stack2
            TreeNode temp = stack1.pop();
            stack2.push(temp);

            // push left and right node of popped node
            if (temp.left != null)
                stack1.push(temp.left);
            if (temp.right != null)
                stack1.push(temp.right);
        }

        // if stack1 is empty print all nodes of stack2
        while (!stack2.isEmpty()) {
            TreeNode temp = stack2.pop();
            System.out.print(temp.val + " ");
            res.add(temp.val);
        }

        return res;
    }


    public static void main(String[] args) {


    }

}
