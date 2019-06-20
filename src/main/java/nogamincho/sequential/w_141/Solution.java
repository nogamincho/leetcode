package nogamincho.sequential.w_141;

//Input: head = [1,2], pos = 0
//Output: true
//Explanation: There is a cycle in the linked list, where tail connects to the first node.

import java.util.HashSet;
import java.util.Set;

//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where tail connects to the second node.
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode node = head;
        Set<ListNode> set = new HashSet<>();
        while (set.add(node)) {
            if( node == null) return true;
            node = node.next;
        }
        return true;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}