package leetcode.DivideTwoIntegers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution divideTest;
    int result;
    int dividend;
    int divisor;

    @Before
    public void init() {
        divideTest = new Solution();
    }

    @Test
    public void Example1() {
        dividend = 10;
        divisor = 3;
        result = divideTest.divide(dividend, divisor);

        assertEquals(3, result);
    }

    @Test
    public void Example2() {
        dividend = 7;
        divisor = -3;
        result = divideTest.divide(dividend, divisor);

        assertEquals(-2, result);
    }
}
