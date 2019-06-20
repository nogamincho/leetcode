package nogamincho.sequential.w_155;

import org.junit.jupiter.api.Test;

class MinStackTest {
    private MinStack solution = new MinStack();
    @Test
    void someTest1() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();
    }
}