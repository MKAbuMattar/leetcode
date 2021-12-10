package leetcode._3SumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++){
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];

                if(sum == target){
                    return sum;
                } else if (sum < target){
                    start++;
                } else {
                    end--;
                }

                if(Math.abs(sum-target) < Math.abs(result-target)){
                    result = sum;
                }
            }
        }
        return result;
    }
}
