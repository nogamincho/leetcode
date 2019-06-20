package nogamincho.helper;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    static ListNode createNode(int[] list) {
        ListNode head = null;
        ListNode previous = null;

        for (int i = 0; i < list.length; i++) {
            ListNode tmp = new ListNode(list[i]);
            if (head == null) {
                head = tmp;
                previous = tmp;
                continue;
            }
            previous.next = tmp;
            previous = tmp;
        }
        return head;
    }
}