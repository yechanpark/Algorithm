package LeetCode.Easy.Array.MaximumSubarray;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class MaximumSubarray {
    public int solution(int[] nums) {
        int currentMax = nums[0];
        int max = nums[0];
        int numsLength = nums.length;
        for (int i = 1; i < numsLength; i++) {

            if (nums[i] > currentMax + nums[i])
                currentMax = nums[i];
            else
                currentMax += nums[i];

            if (currentMax > max)
                max = currentMax;

        }
        return max;
    }
}

/**
 * 키워드 - 카데인 알고리즘 (Kadane's Algorithm)
 */