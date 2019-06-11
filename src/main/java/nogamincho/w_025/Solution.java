package nogamincho.w_025;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//Given 1->2->3->4, you should return the list as 2->1->4->3.
class Solution {
    ListNode currentEnd = null;
    public ListNode swapPairs(ListNode head) {
        ListNode start = head;
        while (start != null) {
            if (start == head && start.next != null)
                head=start.next;
            swap(start);
            currentEnd = start;
            start = start.next;
        }
        return head;
    }
    void swap(ListNode start) {
        ListNode next = start.next;
        if(next == null) return;
        ListNode nextNext = next.next;
        next.next = start; start.next = nextNext;
        if(currentEnd != null)currentEnd.next=next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
