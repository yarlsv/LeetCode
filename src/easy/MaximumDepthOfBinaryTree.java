package easy;

import helper_elements.TreeNode;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {

        if(root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left) + 1 , maxDepth(root.right) + 1);
    }
}
