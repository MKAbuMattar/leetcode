package leetcode.SearchInRotatedSortedArray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution searchTest;
    int[] nums;
    int target;
    int result;
    int out;

    @Before
    public void init() {
        searchTest = new Solution();
    }

    @Test
    public void Example1() {
        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        target = 0;
        result = searchTest.search(nums, target);
        out = 4;

        assertEquals(out, result);
    }

    @Test
    public void Example2() {
        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        target = 3;
        result = searchTest.search(nums, target);
        out = -1;

        assertEquals(out, result);
    }

    @Test
    public void Example3() {
        nums = new int[]{1};
        target = 0;
        result = searchTest.search(nums, target);
        out = -1;

        assertEquals(out, result);
    }
}
