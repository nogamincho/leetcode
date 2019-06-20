package nogamincho.sequential.w_203;

//Input:  1->2->6->3->4->5->6, val = 6
//Output: 1->2->3->4->5
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode present = head;
        ListNode previous = null;

        do {
            if (previous == null && present.val == val) {
                head = present.next;
                present = present.next;
                continue;
            }
            if (present.val == val) {
                previous.next = present.next;
            } else {
                previous = present;
            }
            present = present.next;

        } while (present != null);
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}