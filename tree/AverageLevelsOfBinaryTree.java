package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsOfBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> res = new ArrayList<>();

        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size=queue.size();
            int count=0;
            long sum=0;
            while (size-->0){
                TreeNode t = queue.poll();
                sum+=t.val;
                count++;

                if(t.left!=null){
                    queue.add(t.left);
                }

                if(t.right!=null){
                    queue.add(t.right);
                }
            }
            double average=(double) sum/count;
            res.add(average);
        }

        return res;
    }
}
