package nogamincho.w_021;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode present = null;
        ListNode one = l1;
        ListNode two = l2;
        while (one != null || two != null) {
            if (head == null) {
                if (one.val >= two.val) {
                    head = new ListNode(one.val);
                    one = one.next;
                } else {
                    head = new ListNode(two.val);
                    two = two.next;
                }
                present = head;
                continue;
            }
            if (two == null || (one != null && one.val <= two.val)) {
                present.next = new ListNode(one.val);
                one = one.next;
            } else {
                present.next = new ListNode(two.val);
                two = two.next;
            }
            present = present.next;
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
