package nogamincho.w_026;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeDuplicates() {
        int[] nums = {1,2,3,3,3};
        int result = new Solution().removeDuplicates(nums);
        assertArrayEquals(subArray(nums, result), new int[]{1,2,3});
        assertEquals(3, result);
    }

    @Test
    void subarrayTest() {
        int[] nums = {1,2,3,0,0};
        assertArrayEquals(subArray(nums, 3), new int[]{1,2,3});
    }

    int[] subArray(int[] array, int length) {
        return Arrays.copyOfRange(array, 0, length);
    }
}