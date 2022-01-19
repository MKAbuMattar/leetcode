/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

package leetcode.SwapNodesInPairs;

import leetcode.SinglyLinkedList.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode tmp = head.next;

        head.next = tmp.next;
        tmp.next = head;

        head.next = swapPairs(head.next);

        return tmp;
    }
}
