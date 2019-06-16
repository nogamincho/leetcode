package nogamincho.w_098;

import java.util.Optional;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return root == null || !recursive(root);
    }
    private boolean recursive(TreeNode node) {
        TreeNode left = node.left;
        TreeNode right = node.right;
        if (left == null && right == null) {
            return false;
        }
        if (left == null) {
            return right.val <= node.val
                    || recursive(right);
        }
        if (right == null) {
            return left.val >= node.val
                    || recursive(left);
        }
        return left.val >= node.val
                || node.val >= right.val
                || recursive(left)
                || recursive(right);
    }
}

/*
10
5 15
null null 6 20
 */

//[10,5,15,null,null,6,20]
//Example 1:
//
//        2
//       / \
//      1   3
//
//        Input: [2,1,3]
//        Output: true
//        Example 2:
//
//        5
//       / \
//      1   4
//     / \
//    3   6
//
//        Input: [5,1,4,null,null,3,6]
//        Output: false
//        Explanation: The root node's value is 5 but its right child's value is 4.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}