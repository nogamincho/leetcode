package nogamincho.sequential.w_169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void someTest1() {
        assertEquals(3,solution.majorityElement(new int[]{1,2,2,3,3,3}));
        assertEquals(1,solution.majorityElement(new int[]{1,2,1,2,1,3}));
        assertEquals(2,solution.majorityElement(new int[]{1,2,2,2,3,3}));
        assertEquals(1,solution.majorityElement(new int[]{1,1,1,3}));
    }
}