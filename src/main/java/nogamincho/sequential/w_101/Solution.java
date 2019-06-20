package nogamincho.sequential.w_101;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        deque.add(root);

        while (!deque.isEmpty()) {
            TreeNode left = deque.poll();
            TreeNode right = deque.poll();

            if (left == null && right == null) {
                continue;
            }

            if (left == null || right == null) {
                return false;
            }

            if (left.val != right.val) {
                return false;
            }
            deque.add(left.left);
            deque.add(right.right);
            deque.add(right.left);
            deque.add(left.right);
        }
        return true;
    }
    void createSymetric(Deque<TreeNode> deque, TreeNode left, TreeNode right) {
    }

}
//    For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//        1
//       / \
//      2   2
//     / \ / \
//    3  4 4  3
// ToBe: 3.4.2.1.2.4.3

class SolutionRecursive {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }

        return (node1.val == node2.val)
                && isMirror(node1.left, node2.right)
                && isMirror(node1.right, node2.left);
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