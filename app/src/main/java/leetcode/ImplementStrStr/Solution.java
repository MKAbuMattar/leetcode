package leetcode.ImplementStrStr;


public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() <= haystack.length()) {
            int[] pointer = strStr(needle.toCharArray());
            int i = 0;
            int j = 0;
            while (i < haystack.length()) {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    j++;
                    if (j == needle.length()) {
                        return i - j;
                    }
                } else if (j > 0) {
                    j = pointer[j];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    private int[] strStr(char[] str) {
        int[] pointer = new int[str.length + 1];
        for (int i = 2; i < pointer.length; i++) {
            int j = pointer[i - 1];
            while (j > 0 && str[j] != str[i - 1]) {
                j = pointer[j];
            }
            if (j > 0 || str[j] == str[i - 1]) {
                pointer[i] = j + 1;
            }
        }
        return pointer;
    }
}
