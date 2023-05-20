package easy;

import helper_elements.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>(List.of(root));
        List<Double> result = new ArrayList<>();


        while(!q.isEmpty()) {
            double qlength = q.size();
            double sum = 0;

            for(int i = 0; i < qlength; i++) {
                TreeNode node = q.poll();

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
                sum += node.val;

            }
            result.add(sum/qlength);
        }
        return result;
    }
}
