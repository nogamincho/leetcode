package nogamincho.sequential.w_155;

import java.util.Deque;
import java.util.LinkedList;

class MinStack {
    Deque<Integer> deque = new LinkedList<>();
    /** initialize your data structure here. */
    public MinStack() {
        //
    }

    public void push(int x) {
        deque.add(x);
        return;
    }

    public void pop() {
        deque.removeLast();
        return;
    }

    public int top() {
        return deque.peekLast();
    }

    public int getMin() {
        return deque.size() == 1 ? deque.peek() : deque.stream().min(Integer::compareTo).orElseGet(() -> 0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */