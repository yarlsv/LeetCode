package medium;

import helper_elements.TreeNode;
import org.junit.jupiter.api.Test;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {

        int count = countTree(root, 0);
        return count;
    }

    private int countTree(TreeNode root, int count) {
        if (root == null) {
            return count;
        }
        if (root.left == null && root.right == null) {
            return count + root.val;
        }
        return Math.max(countTree(root.left, count + 1), countTree(root.right, count + 1));
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        System.out.println(deepestLeavesSum(root));
    }
}
