package LeetCode.Easy.Math.CountPrimes;

/**
 * 공식키워드 - Math, Prime, Hash Table, Sieve_of_Eratosthenes(에라토스테네스의 체)
 * <p>
 * i = 2 ~ n-1까지 검사할 때, 소수가 아닌것이 확인됐다고 끝내는 것이 아니라,
 * i * j의 결과를 i * j < n 일때 계속해서 j를 더해가며 소수가 아닌 배열에 저장해놓는다.
 * <p>
 * 다음 i를 검사할 때
 * 해당 배열의 인덱스에 대한 값이 false이면 소수인 것이고,
 * 해당 배열의 인덱스에 대한 값이 true이면 앞전의 i에서 소수가 아니라고 저장해놓은 수가 된다.
 */
public class CountPrimes_BestPractice {
    public int solution(int n) {
        if (n <= 1) return 0;

        boolean[] notPrime = new boolean[n];
        notPrime[0] = true;
        notPrime[1] = true;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!notPrime[i]) {
                for (int j = 2; j * i < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < notPrime.length; i++) {
            if (!notPrime[i]) count++;
        }
        return count;
    }
}