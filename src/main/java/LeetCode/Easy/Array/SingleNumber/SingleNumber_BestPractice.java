package LeetCode.Easy.Array.SingleNumber;

/**
 * we use bitwise XOR to solve this problem :
 * <p>
 * first , we have to know the bitwise XOR in java
 * <p>
 * 0 ^ N = N
 * N ^ N = 0
 * So..... if N is the single number
 * <p>
 * N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
 * <p>
 * = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
 * <p>
 * = 0 ^ 0 ^ ..........^ 0 ^ N
 * <p>
 * = N
 */

public class SingleNumber_BestPractice {
    public int solution(int[] nums) {
        int ans = 0;

        int len = nums.length;
        for (int i = 0; i != len; i++)
            ans ^= nums[i];

        return ans;
    }
}

/**
 * 키워드 - XOR
 */