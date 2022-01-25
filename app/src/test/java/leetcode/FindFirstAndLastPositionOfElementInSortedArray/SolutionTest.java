package leetcode.FindFirstAndLastPositionOfElementInSortedArray;


import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Solution searchRangeTest;
    int[] nums;
    int target;
    int[] result;
    int[] out;

    @Before
    public void init() {
        searchRangeTest = new Solution();
    }

    @Test
    public void Example1() {
        nums = new int[]{5,7,7,8,8,10};
        target = 8;
        result = searchRangeTest.searchRange(nums, target);
        out = new int[]{3,4};

        assertEquals(Arrays.toString(out), Arrays.toString(result));
    }

    @Test
    public void Example2() {
        nums = new int[]{5,7,7,8,8,10};
        target = 6;
        result = searchRangeTest.searchRange(nums, target);
        out = new int[]{-1,-1};

        assertEquals(Arrays.toString(out), Arrays.toString(result));
    }

    @Test
    public void Example3() {
        nums = new int[]{};
        target = 0;
        result = searchRangeTest.searchRange(nums, target);
        out = new int[]{-1,-1};

        assertEquals(Arrays.toString(out), Arrays.toString(result));
    }
}
