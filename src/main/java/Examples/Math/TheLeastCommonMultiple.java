package Examples.Math;

/**
 * 최소공배수 - 유클리드 호제법
 *
 * A, B 두 숫자가 있을 때
 * 1. A와 B를 곱함
 * 2. A와 B의 최대공약수를 구함
 * 3. 1에서 2를 나눔
 */
public class TheLeastCommonMultiple {
    public int lcm(int A, int B) {
        TheGreatestCommonDenominator gcd = new TheGreatestCommonDenominator();
        return (A * B) / gcd.gcd(A, B);
    }
}
