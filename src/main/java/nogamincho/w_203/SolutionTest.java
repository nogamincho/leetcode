package nogamincho.w_203;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void someTest() {
        ListNode node = createNode(new int[]{1, 2, 3});
        do {
            System.out.println(node.val);
            node = node.next;
        } while(node != null);

        // nodeをまわすやりかた
        node = createNode(new int[]{1, 2, 3});
        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    ListNode createNode(int[] list) {
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