package LeetCode.Easy.DynamicProgramming.HouseRobber;

/**
 * Step 5. Iterative + 2 variables (bottom-up)
 * We can notice that in the previous step we use only memo[i] and memo[i-1], so going just 2 steps back.
 * We can hold them in 2 variables instead.
 * This optimization is met in Fibonacci sequence creation and some other problems [to paste links].
 */
public class HouseRobber_BestPractice4_IterativeAndTwoVariables {
    public int solution(int[] nums) {
        /* the order is: prev2, prev1, num  */
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }

}