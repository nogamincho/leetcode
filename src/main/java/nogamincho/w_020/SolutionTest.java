package nogamincho.w_020;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void someTest() {
        assertTrue(solution.isValid("()()(){}{}{}"));
        assertTrue(solution.isValid("()()(){}{{}"));
        assertTrue(solution.isValid("()()()[][[]]{}{}{}"));
        assertFalse(solution.isValid("()()(){[}{]}{}"));
    }
}