package Examples.Math;

public class Sum {
    /**
     * 1~n까지의 합을 리턴
     */
    public int accumulativeSum(int n) {
        if (n <= 1) return n;
        int sum = (n + 1) * (n / 2);

        // 10이 홀수인 경우 중간의 값을 한 번 더 더해야 함
        if (n % 2 != 0)
            sum += (n + 1) / 2;

        return sum;
    }
}
