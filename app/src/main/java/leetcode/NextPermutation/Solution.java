package leetcode.NextPermutation;

public class Solution {
    public void nextPermutation(int[] nums) {
        int last = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                last = i;
            }
        }

        if (last == -1) {
            reverse(nums, 0, nums.length);
            return;
        }

        int minIdx = last + 1;

        for (int i = last + 1; i < nums.length; i++) {
            if (nums[i] > nums[last] && nums[last] < nums[minIdx]) {
                minIdx = i;
            }
        }

        swap(nums, last, minIdx);

        reverse(nums, last + 1, nums.length);
    }

    private void reverse(int[] nums, int start, int end) {
        for (int i = start; i < (start + end + 1) / 2; i++) {
            swap(nums, i, (start + end - i - 1));
        }
    }

    private void swap(int[] nums, int start, int end) {
        int tmp = nums[start];
        nums[start] = nums[end];
        nums[end] = tmp;
    }
}
