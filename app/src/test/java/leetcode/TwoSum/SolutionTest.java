package leetcode.TwoSum;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution twoSumTest;
    int[] result;
    int[] nums;
    int target;
    int[] out;

    @Before
    public void init() {
        twoSumTest = new Solution();
    }

    @Test
    public void Example1() {
        nums = new int[]{2, 7, 11, 15};
        target = 9;
        out = new int[]{0, 1};
        result = twoSumTest.twoSum(nums, target);

        assertEquals(Arrays.toString(out), Arrays.toString(result));
    }

    @Test
    public void Example2() {
        nums = new int[]{3, 2, 4};
        target = 6;
        out = new int[]{1, 2};
        result = twoSumTest.twoSum(nums, target);

        assertEquals(Arrays.toString(out), Arrays.toString(result));
    }

    @Test
    public void Example3() {
        nums = new int[]{3, 3};
        target = 6;
        out = new int[]{0, 1};
        result = twoSumTest.twoSum(nums, target);

        assertEquals(Arrays.toString(out), Arrays.toString(result));
    }

}
