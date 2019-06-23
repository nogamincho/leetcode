package nogamincho.interview.w_056;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void someTest1() {
        int[][] array1 = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] array2 = new int[][]{{1, 6}, {8, 10}, {15, 18}};
        int[][] merged = solution.merge(array1);
        assertArrayEquals(array2, merged);
    }

    @Test
    void someTest2() {
        int[][] array1 = new int[][]{{1, 4}, {4, 5}};
        int[][] array2 = new int[][]{{1, 5}};
        int[][] merged = solution.merge(array1);
        assertArrayEquals(array2, merged);
    }

    @Test
    void someTest3() {
        int[][] array1 = new int[][]{{1, 4},{0, 2}};
        int[][] array2 = new int[][]{{0, 4}};
        int[][] merged = solution.merge(array1);
        assertArrayEquals(array2, merged);
    }

    @Test
    void someTest4() {
        int[][] array1 = new int[][]{{1, 4}, {0, 0}};
        int[][] array2 = new int[][]{{0, 0}, {1, 4}};
        int[][] merged = solution.merge(array1);
        assertArrayEquals(array2, merged);
    }
}