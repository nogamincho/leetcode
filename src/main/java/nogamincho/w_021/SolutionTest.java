package nogamincho.w_021;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void someTest() {
        assertTrue(true);
        ListNode node_1, node_2, node_3, node_4;
        node_1 = new ListNode(1);
        node_2 = new ListNode(2);
        node_3 = new ListNode(3);
        node_4 = new ListNode(4);
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;

        ListNode node = node_1;
        printListNode(new Solution().mergeTwoLists(node, node));
    }

    void printListNode ( ListNode node) {
        do {
            System.out.println(node.val);
        } while((node = node.next) != null);
    }
}