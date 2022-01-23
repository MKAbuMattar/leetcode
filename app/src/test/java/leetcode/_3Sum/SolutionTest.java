package leetcode._3Sum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution threeSumTest;
    List<List<Integer>> result;
    List<List<Integer>> tmp;
    List<Integer> list1;
    List<Integer> list2;

    @Before
    public void init() {
        threeSumTest = new Solution();

        tmp = new ArrayList<>();

        list1 = new ArrayList<>();
        list1.add(-1);
        list1.add(-1);
        list1.add(2);

        list2 = new ArrayList<>();
        list2.add(-1);
        list2.add(0);
        list2.add(1);
    }

    @Test
    public void Example1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        result = threeSumTest.threeSum(nums);

        tmp.add(list1);
        tmp.add(list2);

        assertEquals(tmp, result);
    }

    @Test
    public void Example2() {
        int[] nums = {};
        result = threeSumTest.threeSum(nums);

        assertEquals(tmp, result);
    }

    @Test
    public void Example3() {
        int[] nums = {0};
        result = threeSumTest.threeSum(nums);

        assertEquals(tmp, result);
    }
}
