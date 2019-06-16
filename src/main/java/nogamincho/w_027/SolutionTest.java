package nogamincho.w_027;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void someTest() {

        int[] nums = {3,2,2,3};
        assertEquals(solution.removeElement(nums, 3), 2);
        assertArrayEquals(new int[]{2,2},Arrays.copyOfRange(nums,0,2));
    }
    @Test
    void someTest2() {
//        Given nums = [0,1,2,2,3,0,4,2], val = 2,
//        Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
        int[] nums = {0,1,2,2,3,0,4,2};
        assertEquals(solution.removeElement(nums, 2), 5);
        assertArrayEquals(new int[]{0,1,3,0,4},Arrays.copyOfRange(nums,0,5));
    }

}