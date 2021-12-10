package leetcode.SortColors;

public class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0, j = -1, n = nums.length, k = n, t = -1; i < k; i++) {
            if (nums[i] == 0) {
                t = nums[++j];
                nums[j] = nums[i];
                nums[i] = t;
            } else if (nums[i] == 2) {
                t = nums[--k];
                nums[k] = nums[i];
                nums[i] = t;
                --i;
            }
        }
    }
}
