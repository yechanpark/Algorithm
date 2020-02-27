package Examples.Math;

public class Prime {

    /**
     * n이 소수인지 아닌지 판단
     */
    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    /**
     * 1 ~ n(미포함)의 숫자 중 소수의 갯수를 구함
     */
    public int countPrime(int n) {
        if (n <= 1) return 0;

        boolean[] notPrime = new boolean[n + 1];
        notPrime[0] = true;
        notPrime[1] = true;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!notPrime[i]) {
                for (int j = 2; j * i <= n; j++) {
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

    /**
     * TODO : 1부터 n까지의 숫자 중 소수의 리스트를 구함
     */
    public int[] countPrimeArr(int n) {
        return new int[2];
    }
}
