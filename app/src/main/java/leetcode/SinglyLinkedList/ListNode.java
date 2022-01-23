package leetcode.SinglyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
        next = null;
    }

    public ListNode(int val) {
        this.val = val;
        next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode prv = head;

        for (int i = 1; i < arr.length; i++) {
            prv.next = new ListNode(arr[i]);
            prv = prv.next;
        }

        return head;
    }

    @Override
    public String toString() {
        return val + " -> " + next;
    }
}
