package leetcode._3SumClosest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution threeSumClosestTest;
    int target;
    int result;

    @Before
    public void init() {
        threeSumClosestTest = new Solution();
    }

    @Test
    public void Example1() {
        int[] nums = {-1, 2, 1, -4};
        target = 1;
        result = threeSumClosestTest.threeSumClosest(nums, target);
        assertEquals(2, result);
    }

    @Test
    public void Example2() {
        int[] nums = {0, 0, 0};
        target = 1;
        result = threeSumClosestTest.threeSumClosest(nums, target);
        assertEquals(0, result);
    }

}
