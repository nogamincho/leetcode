package nogamincho.sequential.w_020;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for (Character aChar : chars) {
            if (mappings.containsKey(aChar)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(aChar)) {
                    return false;
                }
            } else {
                stack.push(aChar);
            }
        }

        return stack.isEmpty();
    }
}