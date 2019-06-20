package nogamincho.sequential.w_098;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return root == null || !recursive(root, root.val);
    }
    private boolean recursive(TreeNode node, int limit) {
        TreeNode left = node.left;
        TreeNode right = node.right;
        if (left == null && right == null) {
            return false;
        }
//        if (left == null) {
//            boolean result_11 = right.val <= node.val;
//            boolean result_12 = right.val <= limit;
//            boolean result_13 = recursive(right, Math.min(limit, right.val));
//            return result_11 || result_12 || result_13;
//        }
//        if (right == null) {
//            boolean result_14 = left.val >= node.val;
//            boolean result_15 = left.val >= limit;
//            boolean result_16 = recursive(left, Math.max(limit, left.val));
//            return result_14 || result_15 || result_16;
//        }
        boolean result_01 = left.val >= node.val;
        boolean result_02 = left.val >= limit;
        boolean result_03 = node.val >= right.val;
        boolean result_04 = right.val <= limit;
        boolean result_05 = recursive(left, Math.max(limit, left.val));
        boolean result_06 = recursive(right, Math.min(limit, right.val));

        return result_01 || result_02 || result_03 || result_04 || result_05 || result_06;

    }
}

//[3,1,5,0,2,4,6]
/*
3
1 5
0 2 4 6
 */
/*
10
5 15
null null 6 20
 */

/*
10
5 15
null 16 6 20
 */

/*
10
5 15
null 16 6 20
 */

//[10,5,15,null,16,6,20]
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

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + (left == null ? null : "" + left.val) +
                ", right=" + (right == null ? null : "" + right.val) +
                '}';
    }
}