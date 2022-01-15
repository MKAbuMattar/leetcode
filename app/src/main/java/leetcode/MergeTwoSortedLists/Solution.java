package leetcode.MergeTwoSortedLists;

import leetcode.SinglyLinkedList.ListNode;

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

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode list3;
        ListNode tmp;

        if (list1.val < list2.val) {
            list3 = list1;
            tmp = list3;
            list1 = list1.next;
        } else {
            list3 = list2;
            tmp = list3;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tmp.next = list1;
                tmp = tmp.next;
                list1 = list1.next;
            } else {
                tmp.next = list2;
                tmp = tmp.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            tmp.next = list2;
        } else {
            tmp.next = list1;
        }
        return list3;
    }
}
