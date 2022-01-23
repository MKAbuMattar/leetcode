package leetcode.AddTwoNumbers;

import leetcode.SinglyLinkedList.ListNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution addTwoNumbersTest;
    ListNode result;

    ListNode l1;
    ListNode l2;
    ListNode out;

    @Before
    public void init() {
        addTwoNumbersTest = new Solution();
        l1 = new ListNode();
        l2 = new ListNode();
        out = new ListNode();
    }

    @Test
    public void Example1() {
        l1 = ListNode.createList(new int[]{2, 4, 3});
        l2 = ListNode.createList(new int[]{5, 6, 4});
        out = ListNode.createList(new int[]{7, 0, 8});

        result = addTwoNumbersTest.addTwoNumbers(l1, l2);
        assertEquals(out.toString(), result.toString());
    }

    @Test
    public void Example2() {
        l1 = ListNode.createList(new int[]{0});
        l2 = ListNode.createList(new int[]{0});
        out = ListNode.createList(new int[]{0});

        result = addTwoNumbersTest.addTwoNumbers(l1, l2);
        assertEquals(out.toString(), result.toString());
    }

    @Test
    public void Example3() {
        l1 = ListNode.createList(new int[]{9, 9, 9, 9, 9, 9, 9});
        l2 = ListNode.createList(new int[]{9, 9, 9, 9});
        out = ListNode.createList(new int[]{8, 9, 9, 9, 0, 0, 0, 1});

        result = addTwoNumbersTest.addTwoNumbers(l1, l2);
        assertEquals(out.toString(), result.toString());
    }
}
