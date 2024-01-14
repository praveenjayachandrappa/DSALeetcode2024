package tree;

public class MaxDifferenceBetweenAncestorAndNode {


    int result=0;

    public int maxAncestorDiff(TreeNode root) {


        dfs(root,root.val,root.val);

        return result;
    }


    private void dfs(TreeNode root,int curMin,int curMax){

        if(root==null) return;


        int curResult=Math.max(Math.abs(root.val-curMin),Math.abs(root.val-curMax));

        result=Math.max(result,curResult);

        curMin=Math.min(curMin,root.val);

        curMax=Math.max(curMax,root.val);

        dfs(root.left,curMin,curMax);

        dfs(root.right,curMin,curMax);
    }

    public static void main(String[] args) {



        TreeNode root=new TreeNode(8);

        root.left=new TreeNode(3);

        root.right=new TreeNode(10);

        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(6);

        root.left.right.left=new TreeNode(4);
        root.left.right.right=new TreeNode(7);

        root.right.right=new TreeNode(14);
        root.right.right.left=new TreeNode(13);


        MaxDifferenceBetweenAncestorAndNode obj=new MaxDifferenceBetweenAncestorAndNode();

        int maxAncestorDiff = obj.maxAncestorDiff(root);

        System.out.println(maxAncestorDiff);

    }
}
