package codility.lessons.lesson5_prefixsums;

/**
 * Write a function:
 * <p>
 * class Solution { public int solution(int A, int B, int K); }
 * <p>
 * that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
 * <p>
 * { i : A ≤ i ≤ B, i mod K = 0 }
 * <p>
 * For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * A and B are integers within the range [0..2,000,000,000];
 * K is an integer within the range [1..2,000,000,000];
 * A ≤ B.
 */

public class CountDiv {
    public int solution(int A, int B, int K) {
        int count = B/K - A/K;
        // A가 K로 나누어 떨어지는 경우는 A를 포함해야 하므로 +1
        if (A%K == 0) count++;
        return count;
    }
}

/**
 * 키워드 - 범위 안에서 배수의 갯수 구하기
 * */