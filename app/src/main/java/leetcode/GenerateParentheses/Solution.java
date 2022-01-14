package leetcode.GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        return traverse(n, n, result, "");
    }

    private List<String> traverse(int left, int right, List<String> result, String s) {
        if (left == 0 && right == 0) {
            result.add(s);
        } else {

            if (left > 0) {
                traverse(left - 1, right, result, s + "(");
            }

            if (right > left) {
                traverse(left, right - 1, result, s + ")");
            }
        }

        return result;
    }
}
