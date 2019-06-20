package nogamincho.sequential.w_136;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void someTest1() {
        assertEquals(3,solution.singleNumber(new int[] {1,1,2,2,3}));
        assertEquals(6,solution.singleNumber(new int[] {6,1,1,2,2,2}));
    }
}