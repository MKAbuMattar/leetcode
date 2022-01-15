package leetcode.MergeKSortedLists;

import leetcode.SinglyLinkedList.ListNode;

import java.util.*;

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

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        if (lists.length == 1) {
            return lists[0];
        }

        List<ListNode> list = new ArrayList<>(Arrays.asList(lists));

        while (list.size() != 1) {
            ListNode listNode1 = list.get(0);
            ListNode listNode2 = list.get(1);
            list.remove(0);
            list.remove(0);
            list.add(mergeKLists(listNode1, listNode2));
        }

        return list.get(0);
    }

    private ListNode mergeKLists(ListNode listNode1, ListNode listNode2) {
        ListNode tmp = new ListNode(0);
        ListNode current = tmp;

        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val <= listNode2.val) {
                current.next = listNode1;
                listNode1 = listNode1.next;
            } else {
                current.next = listNode2;
                listNode2 = listNode2.next;
            }
            current = current.next;
        }

        if (listNode1 == null) {
            current.next = listNode2;
        } else {
            current.next = listNode1;
        }

        return tmp.next;
    }
}

