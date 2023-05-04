package medium;

import helper_elements.TreeNode;

public class BinarySearchTreeToGreaterSumTree {

    private int sum = 0;
    public TreeNode bstToGst(TreeNode root) {

        calculateSum(root);
        return root;
    }

    private void calculateSum(TreeNode node) {
        if(node == null) {
            return;
        }

        calculateSum(node.right);
        sum += node.val;
        node.val = sum;

        calculateSum(node.left);
    }
}
