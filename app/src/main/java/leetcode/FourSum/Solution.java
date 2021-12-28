package leetcode.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int index = 0; index < nums.length - 3 && nums[index] <= target / 4; index++) {
            if (index == 0 || nums[index] != nums[index - 1]) {
                for (int pointer = index + 1; pointer < nums.length - 2; pointer++) {
                    if (pointer == index + 1 || nums[pointer] != nums[pointer - 1]) {
                        int currentPointer = pointer + 1;
                        int higherIndex = nums.length - 1;

                        while (currentPointer < higherIndex) {
                            if (nums[index] + nums[pointer] + nums[currentPointer] + nums[higherIndex] == target) {

                                result.add(Arrays.asList(nums[index], nums[pointer], nums[currentPointer], nums[higherIndex]));

                                while (currentPointer < higherIndex && nums[currentPointer] == nums[currentPointer + 1]) {
                                    currentPointer++;
                                }

                                while (currentPointer < higherIndex && nums[higherIndex] == nums[higherIndex - 1]) {
                                    higherIndex--;
                                }

                                currentPointer++;
                                higherIndex--;
                            } else if (nums[index] + nums[pointer] + nums[currentPointer] + nums[higherIndex] < target) {
                                currentPointer++;
                            } else {
                                higherIndex--;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
