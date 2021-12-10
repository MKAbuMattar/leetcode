package leetcode.PartitionList;

import leetcode.SinglyLinkedList.ListNode;

public class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode leftPartition = new ListNode();
        ListNode leftHead = leftPartition;

        ListNode rightPartition = new ListNode();
        ListNode rightHead = rightPartition;

        ListNode current = head;

        while(current != null) {
            if(current.val<x) {
                leftPartition.next=new ListNode(current.val);
                leftPartition=leftPartition.next;
            } else {
                rightPartition.next=new ListNode(current.val);
                rightPartition=rightPartition.next;
            }
            current=current.next;
        }

        leftPartition.next = rightHead.next;

        return leftHead.next;
    }
}
