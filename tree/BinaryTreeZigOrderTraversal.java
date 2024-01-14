package tree;

import java.util.*;

public class BinaryTreeZigOrderTraversal {



    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res=new ArrayList<>();

        if(root==null) return res;

        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);
        boolean flag=true; //left to right
        while (!q.isEmpty()){

            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            while (size-->0){
                TreeNode t = q.poll();
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);

                temp.add(t.val);
            }
            if(!flag)
                Collections.reverse(temp);
            res.add(temp);
            flag=!flag;
        }

        return  res;
    }
}
