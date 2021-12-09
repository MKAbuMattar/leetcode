package leetcode.ReverseInteger;

public class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if ((result * 10) / 10 != result) return 0;
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}
