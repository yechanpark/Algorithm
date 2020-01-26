package leetcode.easy.climbingstairs;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbingStairs {
    public int solution(int n) {
        // n이 3 이하면 똑같이 리턴
        if (n <= 3) return n;

        // 0~n까지 봐야 하므로 n+1개의 배열을 만들어 값을 저장
        int[] memory = new int[n + 1];

        // 분기처리하여 리턴되는 값들을 채움
        memory[0] = 0;
        memory[1] = 1;
        memory[2] = 2;
        memory[3] = 3;

        /**
         * i = 0일 때 -> 0개 분기 처리
         * i = 1일 때 -> 1개 분기 처리
         * i = 2일 때 -> 2개 분기 처리
         * i = 3일 때 -> 3개 분기 처리
         * i = 4일 때 -> arr[i-2] + arr[i-1] = 2 + 3 = 5개
         * i = 5일 때 -> arr[i-2] + arr[i-1] = 3 + 5 = 8개
         * i = 6일 때 -> arr[i-2] + arr[i-1] = 5 + 8 = 13개
         * */
        for (int i = 4; i <= n; i++) {
            memory[i] = memory[i - 1] + memory[i - 2];
        }

        return memory[n];
    }
}

/**
 * 키워드 - 규칙찾기
 */