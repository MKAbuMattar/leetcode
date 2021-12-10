package leetcode.RomantoInteger;

import java.util.TreeMap;

public class Solution {
    private static final TreeMap<Character, Integer> map = new TreeMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        if (null == s || s.isEmpty()) {
            return 0;
        }

        int finalValue = 0;

        int current = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            current = map.get(c);

            if (i + 1 < s.length()) {
                int next = map.get(s.charAt(i + 1));
                if (current >= next) {
                    finalValue += current;
                } else {
                    finalValue += next - current;
                    i++;
                }
            } else {
                finalValue += current;
            }
        }
        return finalValue;
    }
}
