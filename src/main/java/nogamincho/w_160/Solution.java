package nogamincho.w_160;

import nogamincho.helper.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        if (nodeA == null || nodeB == null) return null;
        if(nodeA == nodeB) return nodeA;

        do {
            do {
                if(nodeA == nodeB) {
                    return nodeA;
                }
                nodeB = nodeB.next;
            } while (nodeB != null);
            nodeA = nodeA.next;
            nodeB = headB;
        } while (nodeA != null);

        return null;
    }
}