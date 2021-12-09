package leetcode.AddTwoNumbers;

import leetcode.SinglyLinkedList.ListNode;

public class Solution {
    private static final ListNode ZERO_NODE = new ListNode(0);

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return recursiveSum(l1, l2, 0);
    }

    private ListNode recursiveSum(ListNode a, ListNode b, int carry) {
        int sum = (a.val + b.val) + carry;
        int newCarry = sum / 10;

        ListNode result = new ListNode(sum % 10);

        if (a.next == null && b.next == null) {
            if (newCarry > 0) {
                result.next = new ListNode(newCarry);
            }
        } else {
            result.next = recursiveSum(
                    (a.next == null) ? ZERO_NODE : a.next,
                    (b.next == null) ? ZERO_NODE : b.next, newCarry);
        }

        return result;
    }
}
