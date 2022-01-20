package leetcode.DivideTwoIntegers;

public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }

        long a;
        long b;

        if (dividend < 0) {
            a = -(long) dividend;
        } else {
            a = dividend;
        }

        if (divisor < 0) {
            b = -(long) divisor;
        } else {
            b = divisor;
        }

        int result = divide(a, b, 1);

        if (dividend < 0 && divisor < 0) {
            return result;
        }
        if (dividend < 0 || divisor < 0) {
            return -result;
        }
        return result;
    }

    private int divide(long dividend, long divisor, int count) {
        if (dividend <= 0 || count == 0) {
            return 0;
        }

        if (divisor > dividend) {
            return divide(dividend, divisor >>> 1, count >>> 1);
        } else {
            return divide(dividend - divisor, divisor + divisor, count + count) + count;
        }
    }
}
