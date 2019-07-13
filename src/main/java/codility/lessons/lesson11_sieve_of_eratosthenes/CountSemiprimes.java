package codility.lessons.lesson11_sieve_of_eratosthenes;

import java.util.HashMap;
import java.util.Map;

/**
 * A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.
 * <p>
 * A semiprime is a natural number that is the product of two (not necessarily distinct) prime numbers. The first few semiprimes are 4, 6, 9, 10, 14, 15, 21, 22, 25, 26.
 * <p>
 * You are given two non-empty arrays P and Q, each consisting of M integers. These arrays represent queries about the number of semiprimes within specified ranges.
 * <p>
 * Query K requires you to find the number of semiprimes within the range (P[K], Q[K]), where 1 ≤ P[K] ≤ Q[K] ≤ N.
 * <p>
 * For example, consider an integer N = 26 and arrays P, Q such that:
 * <p>
 * P[0] = 1    Q[0] = 26
 * P[1] = 4    Q[1] = 10
 * P[2] = 16   Q[2] = 20
 * The number of semiprimes within each of these ranges is as follows:
 * <p>
 * (1, 26) is 10,
 * (4, 10) is 4,
 * (16, 20) is 0.
 * Write a function:
 * <p>
 * class Solution { public int[] solution(int N, int[] P, int[] Q); }
 * <p>
 * that, given an integer N and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M elements specifying the consecutive answers to all the queries.
 * <p>
 * For example, given an integer N = 26 and arrays P, Q such that:
 * <p>
 * P[0] = 1    Q[0] = 26
 * P[1] = 4    Q[1] = 10
 * P[2] = 16   Q[2] = 20
 * the function should return the values [10, 4, 0], as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..50,000];
 * M is an integer within the range [1..30,000];
 * each element of arrays P, Q is an integer within the range [1..N];
 * P[i] ≤ Q[i].
 */

public class CountSemiprimes {

    // 소수를 저장해놓는 캐시
    Map<Integer, Integer> primeCache = new HashMap<>();

    // 소수가 아닌 수를 저장해놓는 캐시
    Map<Integer, Integer> nonPrimeCache = new HashMap<>();

    // 1 <= P/Q.length <= 30000
    // 1 <= P요소 <= Q요소 <= N
    // 반소수는 1번만 구해서 P, Q쪽에 비교하는 방식이 빠를 것.
    public int[] solution(int N, int[] P, int[] Q) {

        // 세미 프라임을 저장해놓는 캐시
        Map<Integer, Integer> semiPrimeCache = new HashMap<>();

        // 세미프라임이 아닌걸 저장해놓는 캐시
        Map<Integer, Integer> noneSemiPrimeCache = new HashMap<>();

        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {

            // P[0] ~ Q[0] 까지 순회
            for (int p = P[i]; p <= Q[i]; p++) {

                // 소수 캐싱
                checkPrime(p);

                // 2 * 2 = 4이므로 4 미만은 해당하지 않음
                // 따라서 바로 다음 for에서는 4가 되도록 3을 세팅
                if (p < 4) {
                    p = 3;
                    continue;
                }

                // 논 세미 프라임 캐시에 있다면 다음꺼 바로 감
                if (noneSemiPrimeCache.containsKey(p)) {
                    continue;
                }

                // 세미 프라임 캐시에 있다면 결과에 더함
                if (semiPrimeCache.containsKey(p)) {
                    result[i]++;
                }

                // 두 캐시에 모두 없으면 해당 숫자에 대해 직접 계산
                else {
                    int semiPrimeCount = 0;
                    for (int j = 2; j <= Math.sqrt(p); j++) {
                        if (j * j == p) {
                            // j가 소수면 증가
                            // p가 16일 때, 1 2 4 8 16 이 약수인데 4는 소수가 아니므로 해당되지 않음
                            if (checkPrime(j)) {
                                semiPrimeCount++;
                            }
                        }

                        // 나누어 떨어지는 경우
                        // 8의 경우 1 2 4 8인데,   2x4=8에서  4는 소수가 아니므로 제외해야 함
                        else if (p % j == 0) {
                            // j와 p/j가 동시에 소수면 증가
                            if (checkPrime(j) && checkPrime(p / j))
                                semiPrimeCount += 2;
                        }


                        // 3개가 넘어가는 경우 semi-prime이 아니므로 탈출
                        if (semiPrimeCount >= 3) {
                            break;
                        }

                    }

                    // 약수의 갯수가 1 또는 2라면 semi-prime이므로 해당 숫자를 캐싱, 결과에 더함
                    if (1 <= semiPrimeCount && semiPrimeCount <= 2) {
                        result[i]++;
                        semiPrimeCache.put(p, 1);
                    }

                    else {
                        noneSemiPrimeCache.put(p, 1);
                    }

                }

            }
        }

        return result;
    }


    // 소수인지 아닌지 검사
    boolean checkPrime(int N) {

        if (N <= 1)
            return false;

        // 논 프라임 캐시에 있으면 패스
        if (nonPrimeCache.containsKey(N)) {
            return false;
        }

        // 프라임 캐시에 있으면 true
        if (primeCache.containsKey(N)) {
            return true;
        }

        // 소수는 1과 자기 자신으로만 나뉘어져야 한다.
        // 따라서 2~ sqrt(N) 까지 약수가 1개라도 있다면 소수가 아님
        for (int i = 2; i <= Math.sqrt(N); i++) {

            if (i * i == N) {
                nonPrimeCache.put(N, 1);
                return false;
            } else if (N % i == 0) {
                nonPrimeCache.put(N, 1);
                return false;
            }

        }

        primeCache.put(N, 1);
        return true;
    }

}


/**
 * 키워드 - 소수
 * 키워드 - 약수
 * 키워드 - 캐싱
 * */