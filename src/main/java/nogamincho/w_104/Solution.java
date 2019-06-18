package nogamincho.w_104;

import java.util.function.IntBinaryOperator;

class Solution {
    public int maxDepth(TreeNode root) {
        return recursive(root);
    }

    int recursive(TreeNode node) {
        if (node == null)
            return 0;
        TreeNode left = node.left;
        TreeNode right = node.right;
        if (left == null && right == null ) {
            return 1;
        }
        if (left == null)
            return 1 + recursive(right);
        if (right == null)
            return 1 + recursive(left);

        return 1 + Math.max(recursive(left), recursive(right));
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