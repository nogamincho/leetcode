package nogamincho.w_203;

//Input:  1->2->6->3->4->5->6, val = 6
//Output: 1->2->3->4->5
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode present = head;
        ListNode previous = null;

        do {
            if (present.val == val) {
                previous.next = present.next;
                previous = present;
            } else {
                previous = present;
                present = present.next;
            }
        } while (present != null);

        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}