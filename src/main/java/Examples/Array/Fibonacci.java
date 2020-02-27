package Examples.Array;

public class Fibonacci {

    int[] cache;

    /**
     * 피보나치 수열에서 N 번째 숫자 구하기 (재귀)
     */
    public int fibonacci(int n) {
        if (n < 1) return 0;
        cache = new int[n + 1];
        return recursive(n);
    }

    private int recursive(int n) {
        if (n <= 2) return 1;
        if (cache[n] != 0) return cache[n];

        cache[n] = recursive(n - 2) + recursive(n - 1);
        return cache[n];
    }

}
