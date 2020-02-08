package LeetCode.Easy.DynamicProgramming.HouseRobber;

/**
 * 공식키워드 - Dynamic Programming
 *
 * This particular problem and most of others can be approached using the following sequence:
 * <p>
 * 1. Find recursive relation
 * 2. Recursive (top-down)
 * 3. Recursive + memo (top-down)
 * 4. Iterative + memo (bottom-up)
 * 5. Iterative + N variables (bottom-up)
 * <p>
 * Step 1. Figure out recursive relation.
 * A robber has 2 options:
 * a) rob current house i
 * b) don't rob current house.
 * If an option "a" is selected it means she can't rob previous i-1 house but can safely proceed to the one before previous i-2 and gets all cumulative loot that follows.
 * If an option "b" is selected the robber gets all the possible loot from robbery of i-1 and all the following buildings.
 * <p>
 * So it boils down to calculating what is more profitable:
 * - robbery of current house + loot from houses before the previous
 * - loot from the previous house robbery and any loot captured before that
 * <p>
 * rob(i) = Math.max( rob(i - 2) + currentHouseValue, rob(i - 1) )
 * <p>
 * <p>
 * Step 2. Recursive (top-down)
 * Converting the recurrent relation from Step 1 shound't be very hard.
 * This algorithm will process the same i multiple times and it needs improvement. Time complexity: [to fill]
 */
public class HouseRobber_BestPractice1_Recursive {
    public int solution(int[] nums) {
        return rob(nums, nums.length - 1);
    }

    private int rob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    }
}