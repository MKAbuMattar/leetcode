package leetcode.RemoveNthNodeFromEndofList;

import leetcode.SinglyLinkedList.ListNode;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode();
        temp.next = head;

        ListNode slow = temp;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        assert slow.next != null;
        slow.next = slow.next.next;

        return temp.next;
    }
}
