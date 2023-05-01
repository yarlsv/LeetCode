package easy;

import helper_elements.TreeNode;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                return true;
            } else {
                return false;
            }
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
