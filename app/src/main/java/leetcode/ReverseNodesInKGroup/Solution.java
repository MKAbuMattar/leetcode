/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

package leetcode.ReverseNodesInKGroup;

import leetcode.SinglyLinkedList.ListNode;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int idx = 0;
        ListNode cur = head;
        while (cur != null) {
            idx++;
            cur = cur.next;
        }
        if (k > idx) {
            return head;
        }
        cur = head;
        ListNode node = null;
        for (int i = 0; i < k; i++) {
            ListNode nxt = cur.next;
            cur.next = node;
            node = cur;
            cur = nxt;
        }
        head.next = reverseKGroup(cur, k);
        return node;
    }
}
