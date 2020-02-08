package LeetCode.Easy.DynamicProgramming.HouseRobber;

/**
 * Step 4. Iterative + memo (bottom-up)
 * Converting the recurrent relation from Step 1 shound't be very hard.
 * This algorithm will process the same i multiple times and it needs improvement. Time complexity: [to fill]
 */
public class HouseRobber_BestPractice3_IterativeAndMemo {
    public int solution(int[] nums) {
        if (nums.length == 0) return 0;
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            memo[i + 1] = Math.max(memo[i], memo[i - 1] + val);
        }
        return memo[nums.length];
    }

}