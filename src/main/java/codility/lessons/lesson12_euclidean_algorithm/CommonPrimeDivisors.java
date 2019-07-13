package codility.lessons.lesson12_euclidean_algorithm;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.
 * <p>
 * A prime D is called a prime divisor of a positive integer P if there exists a positive integer K such that D * K = P. For example, 2 and 5 are prime divisors of 20.
 * <p>
 * You are given two positive integers N and M. The goal is to check whether the sets of prime divisors of integers N and M are exactly the same.
 * <p>
 * For example, given:
 * <p>
 * N = 15 and M = 75, the prime divisors are the same: {3, 5};
 * N = 10 and M = 30, the prime divisors aren't the same: {2, 5} is not equal to {2, 3, 5};
 * N = 9 and M = 5, the prime divisors aren't the same: {3} is not equal to {5}.
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A, int[] B); }
 * <p>
 * that, given two non-empty arrays A and B of Z integers, returns the number of positions K for which the prime divisors of A[K] and B[K] are exactly the same.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 15   B[0] = 75
 * A[1] = 10   B[1] = 30
 * A[2] = 3    B[2] = 5
 * the function should return 1, because only one pair (15, 75) has the same set of prime divisors.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * Z is an integer within the range [1..6,000];
 * each element of arrays A, B is an integer within the range [1..2,147,483,647].
 */

public class CommonPrimeDivisors {
    public int solution(int[] A, int[] B) {

        return 1;
    }

    // 최대 공약수를 구함
    private int getGreatestCommonDivisor(int A, int B) {
        return BigInteger.valueOf(A).gcd(BigInteger.valueOf(B)).intValue();
    }

}

/**
 * 키워드 - 유클리드 호제법
 * 키워드 - 최대공약수 : 두 수의 공통된 약수 중 가장 큰 것, gcd (greatest common divisor)
 * 키워드 - BigInteger.valueOf(A).gcd(BigInteger.valueOf(B)).intValue();
 */