package nogamincho.interview.w_066;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void someTest1() {
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    void someTest2() {
        assertArrayEquals(new int[]{4, 3, 2, 2}, solution.plusOne(new int[]{4, 3, 2, 1}));
    }

    @Test
    void someTest3() {
        assertArrayEquals(new int[]{1, 3, 0}, solution.plusOne(new int[]{1, 2, 9}));
    }

    @Test
    void someTest4() {
        assertArrayEquals(new int[]{2, 0, 0}, solution.plusOne(new int[]{1, 9, 9}));
    }

    @Test
    void someTest5() {
        assertArrayEquals(new int[]{1, 0, 0, 0}, solution.plusOne(new int[]{9, 9, 9}));
    }

    @Test
    void someTest6() {
        assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, solution.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }
}