package LeetCode.Easy.Array.FibonacciNumber;

/**
 * Solution 3: Dynamic Programming - Top Down Approach
 * <p>
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
public class FibonacciNumber_BestPractice3_DynamicProgramming_TopDownApproach {
    int[] fib_cache = new int[31];

    public int solution(int N) {
        if (N <= 1)
            return N;
        else if (fib_cache[N] != 0)
            return fib_cache[N];
        else
            return fib_cache[N] = solution(N - 1) + solution(N - 2);
    }

}