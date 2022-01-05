package leetcode.ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String string) {
        Stack<Character> stackBracket = new Stack<>();

        for (int idx = 0; idx < string.length(); idx++) {
            char bracket = string.charAt(idx);

            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stackBracket.push(getBracket(bracket));
            } else if (stackBracket.isEmpty() || stackBracket.pop() != bracket) {
                return false;
            }
        }
        return stackBracket.isEmpty();
    }

    private char getBracket(char bracket) {
        if (bracket == '(') {
            return ')';
        }
        if (bracket == '[') {
            return ']';
        }
        return '}';
    }
}
