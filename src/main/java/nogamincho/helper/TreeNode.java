package nogamincho.helper;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    static TreeNode create(int[] nums) {
        return recursive(new TreeNode(nums[0]), nums, 0);
    }

    static TreeNode recursive (TreeNode node, int[] nums, int idx) {
        if (2 * idx + 1 >= nums.length) {
            return node;
        }
        node.left = recursive(new TreeNode(nums[2 * idx + 1]), nums, 2 * idx +1);
        node.right = recursive(new TreeNode(nums[2 * idx + 2]), nums, 2 * idx +2);
        return node;
    }

}
