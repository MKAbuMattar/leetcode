package leetcode.LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final static String[] digitsToChars = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private void letterCombinations(List<String> candidates, StringBuilder curRes, List<String> result) {

        if (curRes.length() == candidates.size()) {
            result.add(curRes.toString());
            return;
        }

        String candidate = candidates.get(curRes.length());

        for (int i = 0; i < candidate.length(); i++) {
            curRes.append(candidate.charAt(i));
            letterCombinations(candidates, curRes, result);
            curRes.deleteCharAt(curRes.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) {
            return new ArrayList();
        }

        List<String> candidates = new ArrayList<>();

        for (char c : digits.toCharArray()) {
            candidates.add(digitsToChars[c - '0']);
        }

        List<String> result = new ArrayList<>();
        letterCombinations(candidates, new StringBuilder(), result);
        return result;
    }
}
