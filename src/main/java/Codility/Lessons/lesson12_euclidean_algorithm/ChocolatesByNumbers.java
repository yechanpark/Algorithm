package Codility.Lessons.lesson12_euclidean_algorithm;

import java.math.BigInteger;

/**
 * Two positive integers N and M are given. Integer N represents the number of chocolates arranged in a circle, numbered from 0 to N − 1.
 * <p>
 * You start to eat the chocolates. After eating a chocolate you leave only a wrapper.
 * <p>
 * You begin with eating chocolate number 0. Then you omit the next M − 1 chocolates or wrappers on the circle, and eat the following one.
 * <p>
 * More precisely, if you ate chocolate number X, then you will next eat the chocolate with number (X + M) modulo N (remainder of division).
 * <p>
 * You stop eating when you encounter an empty wrapper.
 * <p>
 * For example, given integers N = 10 and M = 4. You will eat the following chocolates: 0, 4, 8, 2, 6.
 * <p>
 * The goal is to count the number of chocolates that you will eat, following the above rules.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int N, int M); }
 * <p>
 * that, given two positive integers N and M, returns the number of chocolates that you will eat.
 * <p>
 * For example, given integers N = 10 and M = 4. the function should return 5, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N and M are integers within the range [1..1,000,000,000].
 *
 * @see <a href="https://ergate.tistory.com/entry/Codility-ChocolatesByNumbers-1">참고</a>
 */

public class ChocolatesByNumbers {
    public int solution(int N, int M) {

        if (N == 0) return 0;
        if (N == 1) return 1;

        // 최대공약수를 구하면 된다.
        int gcd = getGreatestCommonDivisor(N, M);

        // 최대공약수가 1이면 모든 초콜릿을 거치므로 초콜렛의 갯수(N) 리턴
        if (gcd == 1) {
            return N;
        }

        // 최대공약수가 1이 아니면 전체 갯수(N) / 최대공약수(gcd) 리턴
        else {
            return N / gcd;
        }
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