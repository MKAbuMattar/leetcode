package leetcode.FindFirstAndLastPositionOfElementInSortedArray;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low <= high) {
            mid = (low + high) >> 1;
            if(nums[mid] == target && nums[low] == nums[high]) {
                return new int[]{low, high};
            } else if(nums[mid] == target && nums[low] < target) {
                low++;
            } else if(nums[mid] == target && target < nums[high]) {
                high--;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
