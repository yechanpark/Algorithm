package LeetCode.Easy.DynamicProgramming.HouseRobber;

import java.util.Arrays;

/**
 * Step 3. Recursive + memo (top-down).
 * Much better, this should run in O(n) time. Space complexity is O(n) as well, because of the recursion stack, let's try to get rid of it.
 */
public class HouseRobber_BestPractice2_RecursiveAndMemo {
    private int[] memo;

    public int solution(int[] nums) {
        memo = new int[nums.length + 1];
        Arrays.fill(memo, -1);
        return rob(nums, nums.length - 1);
    }

    private int rob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        if (memo[i] >= 0) {
            return memo[i];
        }
        int result = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
        memo[i] = result;
        return result;
    }
}