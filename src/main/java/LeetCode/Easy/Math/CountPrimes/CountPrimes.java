package LeetCode.Easy.Math.CountPrimes;

/**
 * 키워드 - 소수(Prime) 구하기
 * <p>
 * Count the number of prime numbers less than a non-negative number, n.
 * <p>
 * Example:
 * <p>
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
public class CountPrimes {
    public int solution(int n) {
        int count = 0;
        // 2부터 n-1까지 소수인지 검사 (1은 소수가 아님, n은 포함하지 않음)
        for (int i = 2; i < n; i++) {

            // 2부터 i까지 돌면서 i가 소수인지 검사
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) break;
                if (i == j) count++;
            }
        }
        return count;

    }
}