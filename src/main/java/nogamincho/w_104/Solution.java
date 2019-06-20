package nogamincho.w_104;

import java.util.function.IntBinaryOperator;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right == null ) {
            return 1;
        }
        if (left == null)
            return 1 + maxDepth(right);
        if (right == null)
            return 1 + maxDepth(left);

        return 1 + Math.max(maxDepth(left), maxDepth(right));
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}