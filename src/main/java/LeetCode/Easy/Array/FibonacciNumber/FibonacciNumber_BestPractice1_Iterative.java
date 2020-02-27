package LeetCode.Easy.Array.FibonacciNumber;

/**
 * Solution 1: Iterative
 * <p>
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class FibonacciNumber_BestPractice1_Iterative {

    public int solution(int N) {
        if (N <= 1)
            return N;

        int a = 0, b = 1;

        while (N-- > 1) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

}