package nogamincho.sequential.w_104;

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
    @Disabled
    void someTest1() {
        assertEquals(1,1);
        assertTrue(true);
        assertFalse(false);
    }

    @Test
    void someTest2() {
        List<Integer> integers = Arrays.asList(3,1,5,0,2,4,6);
        TreeNode result = recursive(new TreeNode(integers.get(0)), integers, 0);
        assertEquals(3,solution.maxDepth(result));
    }

    @Test
    void someTest3() {
        List<Integer> integers = Arrays.asList(3,null,20,null,null,15,7);
        TreeNode result = recursive(new TreeNode(integers.get(0)), integers, 0);
        assertEquals(3,solution.maxDepth(result));
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
}