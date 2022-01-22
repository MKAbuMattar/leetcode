package leetcode.LongestValidParentheses;

public class Solution {
    public int longestValidParentheses(String s) {
        char[] arrParentheses = s.toCharArray();
        int[] tmp = new int[arrParentheses.length];

        int open = 0;
        int max = 0;

        for (int i = 0; i < arrParentheses.length; i++) {
            if (arrParentheses[i] == '(') {
                open++;
            }

            if (arrParentheses[i] == ')' && open > 0) {
                tmp[i] = 2 + tmp[i - 1] + (i - 2 - tmp[i - 1] > 0 ? tmp[i - 2 - tmp[i - 1]] : 0);
                open--;
            }

            if (tmp[i] > max) {
                max = tmp[i];
            }
        }
        return max;
    }
}
