package LeetCode.Easy.Array.FibonacciNumber;

/**
 * Solution 4: Dynamic Programming - Bottom Up Approach
 * <p>
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
public class FibonacciNumber_BestPractice4_DynamicProgramming_BottomUpApproach {

    public int solution(int N) {
        if (N <= 1)
            return N;

        int[] fib_cache = new int[N + 1];
        fib_cache[1] = 1;

        for (int i = 2; i <= N; i++) {
            fib_cache[i] = fib_cache[i - 1] + fib_cache[i - 2];
        }
        return fib_cache[N];
    }

}