package LeetCode.Easy.Array.FibonacciNumber;

/**
 * Solution 2: Recursive
 * <p>
 * Time complexity: O(2^n)- since T(n) = T(n-1) + T(n-2)is an exponential time
 * Space complexity: O(n) - space for recursive function call stack
 */
public class FibonacciNumber_BestPractice2_Recursive {

    public int solution(int N) {
        if (N <= 1)
            return N;
        else
            return solution(N - 1) + solution(N - 2);
    }

}