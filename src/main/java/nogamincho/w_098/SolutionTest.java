package nogamincho.w_098;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void someTest() {
        List<Integer> integers = Arrays.asList(1,2,3);
        TreeNode result = recursive(new TreeNode(integers.get(0)), integers, 0);
        assertTrue(solution.isValidBST(result));
    }
    @Test
    void someTest2() {
        List<Integer> integers = Arrays.asList(5,1,4,null,null,3,6);
        TreeNode result = recursive(new TreeNode(integers.get(0)), integers, 0);
        assertFalse(solution.isValidBST(result));
    }


    TreeNode recursive (TreeNode node, List<Integer> nums, int idx) {
        if (2 * idx + 1 >= nums.size()) {
            return node;
        }
        Function<Integer, TreeNode> func = (index) -> Optional.ofNullable(nums.get(index))
                .map(num -> recursive(new TreeNode(num), nums, index))
                .orElseGet(() -> null);
        node.left = func.apply(2 * idx + 1);
        node.right = func.apply(2 * idx + 2);
        return node;
    }

//    TreeNode recursive (TreeNode node, List<Integer> nums, int idx) {
//        if (2 * idx + 1 >= nums.size()) {
//            return node;
//        }
//        node.left = recursive(new TreeNode(nums.get(2 * idx + 1)), nums, 2 * idx +1);
//        node.right = recursive(new TreeNode(nums.get(2 * idx + 2)), nums, 2 * idx +2);
//        return node;
//    }
}