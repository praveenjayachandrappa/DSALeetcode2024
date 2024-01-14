package tree.BST;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MinimumDifference {

    List<Integer> inorderList;

    public int getMinimumDifference(TreeNode root) {

        if(root==null) return 0;


        int ans=Integer.MAX_VALUE;
        inorderList=new ArrayList();
        dfs(root);

        //  System.out.println(inorderList);

        for(int i=1;i<inorderList.size();i++){

            int diff=inorderList.get(i)-inorderList.get(i-1);
            ans=Math.min(ans,diff);
        }


        return ans;
    }


    private void dfs(TreeNode root){

        if(root==null) return;

        dfs(root.left);

        inorderList.add(root.val);

        dfs(root.right);
    }
}
