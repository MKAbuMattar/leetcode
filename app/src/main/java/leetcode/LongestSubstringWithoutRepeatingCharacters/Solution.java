package leetcode.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }

        int fast = 0;
        int slow = 0;
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()){
            if (map.containsKey(c)){
                slow = Math.max(slow, map.get(c) + 1);
            }
            map.put(c, fast);
            max = Math.max(max, fast - slow + 1);
            fast++;
        }

        return max;
    }
}
