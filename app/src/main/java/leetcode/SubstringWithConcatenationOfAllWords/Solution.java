package leetcode.SubstringWithConcatenationOfAllWords;

import java.util.*;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        int strLen = s.length();
        int wordsLen = words.length;
        int wordLen;

        if (strLen == 0 || wordsLen == 0 || (wordLen = words[0].length()) == 0) {
            return result;
        }

        Map<String, Integer> coll = new HashMap<>();

        for (String word : words) {
            coll.put(word, coll.getOrDefault(word, 0) + 1);
        }

        Map<String, Integer> curColl = new HashMap<>();

        int start = 0;
        int len = wordsLen * wordLen;

        String test;
        String tmp;

        for (int i = 0; i < wordLen; i++) {
            curColl.clear();
            start = i;

            if (start + len > strLen) {
                return result;
            }

            for (int j = i; j + wordLen <= strLen; j += wordLen) {
                test = s.substring(j, j + wordLen);
                if (coll.containsKey(test)) {
                    if (!curColl.containsKey(test) || curColl.get(test) < coll.get(test)) {
                        curColl.put(test, curColl.getOrDefault(test, 0) + 1);

                        if (start + len == j + wordLen) {
                            result.add(start);
                            decreaseCount(curColl, s.substring(start, start + wordLen));
                            start += wordLen;
                        }
                        continue;
                    }

                    while (!(tmp = s.substring(start, start + wordLen)).equals(test)) {
                        decreaseCount(curColl, tmp);
                        start += wordLen;
                    }

                    start += wordLen;

                    if (start + len > strLen) {
                        break;
                    }

                    continue;
                }

                start = j + wordLen;

                if (start + len > strLen) {
                    break;
                }
                curColl.clear();
            }
        }
        return result;
    }

    private void decreaseCount(Map<String, Integer> curColl, String tmp) {
        if (curColl.get(tmp) == 1) {
            curColl.remove(tmp);
        } else {
            curColl.put(tmp, curColl.get(tmp) - 1);
        }
    }
}
