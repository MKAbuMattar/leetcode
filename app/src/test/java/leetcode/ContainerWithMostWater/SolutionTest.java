package leetcode.ContainerWithMostWater;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution maxAreaTest;
    int result;

    @Before
    public void init() {
        maxAreaTest = new Solution();
    }

    @Test
    public void Example1() {
       int[] height = {1,8,6,2,5,4,8,3,7};
        result = maxAreaTest.maxArea(height);

        assertEquals(49, result);
    }

    @Test
    public void Example2() {
        int[] height = {1,1};
        result = maxAreaTest.maxArea(height);

        assertEquals(1, result);
    }

}
