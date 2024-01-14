package tree;

import java.util.*;

public class RightSideViewOfBinaryTree {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> res=new ArrayList<>();
        if(root==null)
        return res;

        ArrayDeque<TreeNode> queue=new ArrayDeque<>();

        queue.add(root);


        while (!queue.isEmpty()){

            int size=queue.size();
        TreeNode lastNode=null;
            while (size-->0){

                TreeNode t = queue.pollLast();

                if(t.right!=null)
                    queue.addFirst(t.right);

                if(t.left!=null)
                    queue.addFirst(t.left);

                if(lastNode==null)
                    lastNode=t;
            }

            res.add(lastNode.val);
        }

        return res;
    }
}
