package Examples.Math;

public class Factorial {

    /**
     * n!을 계산
     */
    public int factorial(int n) {
        if (n <= 1 ) return n;
        return n * factorial(n-1);
    }
}
