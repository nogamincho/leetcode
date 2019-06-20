package nogamincho.sequential.w_101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void someTest() {
        assertEquals(1,1);
        assertEquals(1,1);

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        TreeNode result = recursive(new TreeNode(nums[0]), nums, 0);

    }

    TreeNode recursive (TreeNode node, int[] nums, int idx) {
        if (2 * idx + 1 >= nums.length) {
            return node;
        }
        node.left = recursive(new TreeNode(nums[2 * idx + 1]), nums, 2 * idx +1);
        node.right = recursive(new TreeNode(nums[2 * idx + 2]), nums, 2 * idx +2);
        return node;
    }

}