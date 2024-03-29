package nogamincho.sequential.w_098;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void someTest() {
        List<Integer> integers = Arrays.asList(2,1,3);
        TreeNode result = recursive(new TreeNode(integers.get(0)), integers, 0);
        assertTrue(solution.isValidBST(result));
    }
    @Test
    void someTest2() {
        List<Integer> integers = Arrays.asList(5,1,4,null,null,3,6);
        TreeNode result = recursive(new TreeNode(integers.get(0)), integers, 0);
        assertFalse(solution.isValidBST(result));
    }

    @Test
    void someTest3() {
        assertTrue(solution.isValidBST(null));
    }

    @Test
    void someTest4() {
        List<Integer> integers = Arrays.asList(10,5,15,null,null,6,20);
        TreeNode result = recursive(new TreeNode(integers.get(0)), integers, 0);
        assertFalse(solution.isValidBST(result));
    }

    @Test
    @Disabled
    void someTest5() {
        List<Integer> integers = Arrays.asList(10,5,15,null,16,6,20);
        TreeNode result = recursive(new TreeNode(integers.get(0)), integers, 0);
        assertFalse(solution.isValidBST(result));
    }
    @Test
    void someTest6() {
        List<Integer> integers = Arrays.asList(3,1,5,0,2,4,6);
        TreeNode result = recursive(new TreeNode(integers.get(0)), integers, 0);
        assertTrue(solution.isValidBST(result));
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