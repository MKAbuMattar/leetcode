package leetcode.SearchInsertPosition;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Solution searchInsertTest;
    int[] nums;
    int target;
    int result;
    int out;

    @Before
    public void init() {
        searchInsertTest = new Solution();
    }

    @Test
    public void Example1() {
        nums = new int[]{1, 3, 5, 6};
        target = 5;
        result = searchInsertTest.searchInsert(nums, target);
        out = 2;

        assertEquals(out, result);
    }

    @Test
    public void Example2() {
        nums = new int[]{1, 3, 5, 6};
        target = 2;
        result = searchInsertTest.searchInsert(nums, target);
        out = 1;

        assertEquals(out, result);
    }

    @Test
    public void Example3() {
        nums = new int[]{1, 3, 5, 6};
        target = 7;
        result = searchInsertTest.searchInsert(nums, target);
        out = 4;

        assertEquals(out, result);
    }
}
